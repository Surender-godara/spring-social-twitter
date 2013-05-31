/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.twitter.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
class MediaEntityMixin {

	@JsonCreator
	public MediaEntityMixin(
			@JsonProperty("id") long id, 
			@JsonProperty("media_url")String mediaHttp, 
			@JsonProperty("media_url_https")String mediaHttps, 
			@JsonProperty("url")String url, 
			@JsonProperty("display_url")String display, 
			@JsonProperty("expanded_url")String expanded, 
			@JsonProperty("type")String type, 
			@JsonProperty("indices")int[] indices) {}
	
}
