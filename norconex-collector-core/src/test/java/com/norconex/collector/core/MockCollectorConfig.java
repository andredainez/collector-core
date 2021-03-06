/* Copyright 2016-2017 Norconex Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.norconex.collector.core;

import java.io.Writer;

import org.apache.commons.configuration.XMLConfiguration;

import com.norconex.collector.core.crawler.MockCrawlerConfig;

public class MockCollectorConfig extends AbstractCollectorConfig {
    
    public MockCollectorConfig() {
        super(MockCrawlerConfig.class);
    }
    
    @Override
    protected void loadCollectorConfigFromXML(XMLConfiguration xml) {
        // TODO Auto-generated method stub
        
    }
    @Override
    protected void saveCollectorConfigToXML(Writer out) {
        // TODO Auto-generated method stub
        
    }
}