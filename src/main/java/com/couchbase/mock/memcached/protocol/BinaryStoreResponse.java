/*
 * Copyright 2017 Couchbase, Inc.
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
package com.couchbase.mock.memcached.protocol;

import com.couchbase.mock.memcached.MutationStatus;
import com.couchbase.mock.memcached.MutationInfoWriter;

/**
 * @author Trond Norbye
 */
public class BinaryStoreResponse extends BinaryResponse {

    public BinaryStoreResponse(BinaryCommand command, ErrorCode errorCode, long cas) {
        super(command, errorCode);
        buffer.rewind();
    }
    public BinaryStoreResponse(BinaryCommand command, MutationStatus ms, MutationInfoWriter miw, long cas) {
        super(command, ms, miw, cas);
        buffer.rewind();
    }
}

