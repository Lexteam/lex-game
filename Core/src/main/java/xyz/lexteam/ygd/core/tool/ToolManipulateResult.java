/*
 * Copyright 2015-2016 Lexteam
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
package xyz.lexteam.ygd.core.tool;

/**
 * Represents the different ways tool manipulation can end.
 *
 * @author Jamie Mansfield
 */
public enum ToolManipulateResult {

    CANT_MANIPULATE,
    FAILURE,
    SUCCESS;

    /**
     * Checks is the result was successful.
     *
     * @return {@code True} if it was, {@code false} otherwise.
     */
    public boolean wasSuccessful() {
        return this == SUCCESS;
    }
}
