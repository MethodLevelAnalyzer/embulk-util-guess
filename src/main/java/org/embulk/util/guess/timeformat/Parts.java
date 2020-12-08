/*
 * Copyright 2020 The Embulk project
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

package org.embulk.util.guess.timeformat;

/**
 * @see <a href="https://github.com/embulk/embulk/blob/v0.10.19/embulk-core/src/main/ruby/embulk/guess/time_format_guess.rb#L3-L22">time_format_guess.rb</a>
 */
class Parts {
    private Parts() {
        // No instantiation.
    }

    /**
     * <pre>{@code MONTH_NAME_SHORT = /Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec/}</pre>
     */
    static final String MONTH_NAME_SHORT =
            "(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)";

    /**
     * <pre>{@code MONTH_NAME_FULL = /January|February|March|April|May|June|July|August|September|October|November|December/}</pre>
     */
    static final String MONTH_NAME_FULL =
            "(January|February|March|April|May|June|July|August|September|October|November|December)";

    /**
     * <pre>{@code WEEKDAY_NAME_SHORT = /Sun|Mon|Tue|Wed|Thu|Fri|Sat/}</pre>
     */
    static final String WEEKDAY_NAME_SHORT =
            "(Sun|Mon|Tue|Wed|Thu|Fri|Sat)";

    /**
     * <pre>{@code WEEKDAY_NAME_FULL = /Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday/}</pre>
     */
    static final String WEEKDAY_NAME_FULL =
            "(Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday)";

    /**
     * <pre>{@code ZONE_OFF = /(?:Z|[\-\+]\d\d(?::?\d\d)?)/}</pre>
     */
    static final String ZONE_OFF = "(?:Z|[\\-\\+]\\d\\d(?::?\\d\\d)?)";

    /**
     * <pre>{@code ZONE_ABB = /[A-Z]{1,3}/}</pre>
     */
    static final String ZONE_ABB = "([A-Z]{1,3})";
}
