/**
 * SPDX-FileCopyrightText: 2018-2021 SAP SE or an SAP affiliate company and Cloud Security Client Java contributors
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.cloud.security.config;

public interface EnvironmentLoader {
	/**
	 * Determines the current type of {@link Environment}.
	 *
	 * @return the current environment
	 */
	Environment getCurrent();
}
