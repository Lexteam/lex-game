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
package xyz.lexteam.ygd.core.panel;

/**
 * Represents a panel, containing a connection
 *
 * @author Tom Drever
 */
public interface Panel extends BasePanel {

    /**
     * Gets the panel's connection.
     *
     * @return the panel's connection.
     */
    Connection getConnection();

    /**
     * Sets the panel's connection.
     *
     * @param connection the new connection.
     */
    void setConnection(Connection connection);

    /**
     * Gets the duration of the panel.
     * The duration is in seconds.
     *
     * @return the pulse duration.
     */
    int getDuration();

    /**
     * Sets the pulse duration of this panel.
     *
     * @param duration the new duration.
     */
    void setDuration(int duration);

    /**
     * Gets whether or not the panel is burnt out.
     *
     * @return {@code true} if panel is burnt out.
     */
    boolean isBurntout();

    /**
     * Sets whether or not the panel is burnt out.
     *
     * @param burntout the new value.
     */
    void setBurntout(boolean burntout);

    /**
     * Gets whether or not the panel is currently cooling down
     *
     * @return {@code true} if the panel is cooling down
     */
    boolean isCoolingDown();

    /**
     * Sets whether or not the panel is cooling down
     *
     * @param coolingDown the new value
     */
    void setCoolingDown(boolean coolingDown);

    /**
     * Gets whether the panel is fixed; whether tools can interact with it
     *
     * @return {@code true} if the panel is fixed
     */
    boolean isFixedPanel();

    /**
     * Sets whether or not the panel is fixed.
     *
     * @param fixed the new value.
     */
    void setFixedPanel(boolean fixed);

}
