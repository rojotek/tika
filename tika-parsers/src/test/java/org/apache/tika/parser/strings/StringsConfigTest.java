/*
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
package org.apache.tika.parser.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringsConfigTest {

	@Test
	public void testNoConfig() {
		StringsConfig config = new StringsConfig();
		assertEquals("Invalid default filePath value", "", config.getStringsPath());
		assertEquals("Invalid default encoding value", StringsEncoding.SINGLE_7_BIT, config.getEncoding());
		assertEquals("Invalid default min-len value", 4, config.getMinLength());
		assertEquals("Invalid default timeout value", 120, config.getTimeout());
	}
}
