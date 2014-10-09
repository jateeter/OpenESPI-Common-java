/*
 * Copyright 2013, 2014 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.energyos.espi.common.service.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.energyos.espi.common.domain.UsageSummary;
import org.energyos.espi.common.domain.UsagePoint;
import org.energyos.espi.common.models.atom.EntryType;
import org.energyos.espi.common.repositories.UsageSummaryRepository;
import org.energyos.espi.common.service.UsageSummaryService;
import org.energyos.espi.common.service.ImportService;
import org.energyos.espi.common.service.ResourceService;
import org.energyos.espi.common.utils.EntryTypeIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsageSummaryServiceImpl implements UsageSummaryService {

	@Autowired
	private UsageSummaryRepository usageSummaryRepository;

	@Autowired
	private ResourceService resourceService;

	@Autowired
	private ImportService importService;

	@Override
	public UsageSummary findByUUID(UUID uuid) {
		return usageSummaryRepository.findByUUID(uuid);
	}

	public UsageSummary findById(Long usageSummaryId) {
		return usageSummaryRepository.findById(usageSummaryId);
	}

	@Override
	public void persist(UsageSummary usageSummary) {
		usageSummaryRepository.persist(usageSummary);
	}

	@Override
	public void delete(UsageSummary usageSummary) {
		usageSummaryRepository.deleteById(usageSummary.getId());
	}

	@Override
	public void associateByUUID(UsagePoint usagePoint, UUID uuid) {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public EntryTypeIterator findEntryTypeIterator(Long retailCustomerId,
			Long usagePointId) {
		EntryTypeIterator result = null;
		try {
			// TODO - this is sub-optimal (but defers the need to understan
			// creation of an EntryType
			List<Long> temp = new ArrayList<Long>();
			temp = resourceService.findAllIds(UsageSummary.class);
			result = (new EntryTypeIterator(resourceService, temp,
					UsageSummary.class));
		} catch (Exception e) {
			// TODO need a log file entry as we are going to return a null if
			// it's not found
			result = null;
		}
		return result;
	}

	@Override
	public EntryType findEntryType(Long retailCustomerId, Long usagePointId,
			Long usageSummaryId) {
		EntryType result = null;
		try {
			// TODO - this is sub-optimal (but defers the need to understan
			// creation of an EntryType
			List<Long> temp = new ArrayList<Long>();
			temp.add(usageSummaryId);
			result = (new EntryTypeIterator(resourceService, temp,
					UsageSummary.class)).nextEntry(UsageSummary.class);
		} catch (Exception e) {
			// TODO need a log file entry as we are going to return a null if
			// it's not found
			result = null;
		}
		return result;
	}

	@Override
	public UsageSummary importResource(InputStream stream) {
		try {
			importService.importData(stream, null);
			EntryType entry = importService.getEntries().get(0);
			UsageSummary usageSummary = entry.getContent().getUsageSummary();
			return usageSummary;
		} catch (Exception e) {
			return null;
		}
	}

	public void setUsageSummaryRepository(
			UsageSummaryRepository usageSummaryRepository) {
		this.usageSummaryRepository = usageSummaryRepository;
	}

	public UsageSummaryRepository getUsageSummaryRepository() {
		return this.usageSummaryRepository;
	}

	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	public ResourceService getResourceService() {
		return this.resourceService;
	}

	public void setImportService(ImportService importService) {
		this.importService = importService;
	}

	public ImportService getImportService() {
		return this.importService;
	}

}
