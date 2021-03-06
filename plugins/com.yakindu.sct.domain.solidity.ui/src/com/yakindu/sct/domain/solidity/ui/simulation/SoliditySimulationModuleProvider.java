/**
 * Copyright (c) 2018 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package com.yakindu.sct.domain.solidity.ui.simulation;

import org.yakindu.sct.domain.extension.IModuleProvider;
import org.yakindu.sct.domain.generic.simulation.SimulationModuleProvider;

import com.google.inject.Module;
/**
 * 
 * @author Andreas Muelder - Initial contribution and API
 * 
 */
public class SoliditySimulationModuleProvider extends SimulationModuleProvider implements IModuleProvider {

	@Override
	public Module getModule(String... options) {
		return new SoliditySimulationModule();
	}
	
}
