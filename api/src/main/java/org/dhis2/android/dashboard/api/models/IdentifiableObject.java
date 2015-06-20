/*
 * Copyright (c) 2015, dhis2
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.dhis2.android.dashboard.api.models;


import org.joda.time.DateTime;

import java.util.Comparator;

public interface IdentifiableObject {
    Comparator<IdentifiableObject> DISPLAY_NAME_COMPARATOR = new NameComparator();

    class NameComparator implements Comparator<IdentifiableObject> {

        @Override
        public int compare(IdentifiableObject first, IdentifiableObject second) {
            if (first != null && first.getDisplayName() != null
                    && second != null && second.getDisplayName() != null) {
                return first.getDisplayName().compareTo(second.getDisplayName());
            }

            return 0;
        }
    }

    void setId(long id);

    void setUId(String uId);

    long getId();

    void setName(String name);

    void setDisplayName(String displayName);

    void setCreated(DateTime created);

    void setLastUpdated(DateTime lastUpdated);

    void setAccess(Access access);

    String getUId();

    String getName();

    String getDisplayName();

    DateTime getCreated();

    DateTime getLastUpdated();

    Access getAccess();
}