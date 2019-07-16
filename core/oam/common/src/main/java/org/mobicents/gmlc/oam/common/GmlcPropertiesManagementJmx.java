/*
 * TeleStax, Open Source Cloud Communications  Copyright 2012.
 * and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.mobicents.gmlc.oam.common;

import org.apache.log4j.Logger;

import javax.naming.OperationNotSupportedException;

import org.mobicents.gmlc.GmlcPropertiesManagement;
//import org.mobicents.gmlc.GmlcManagement;

/**
 *
 * @author masood alam
 *
 */
public class GmlcPropertiesManagementJmx implements GmlcPropertiesManagementJmxMBean {

    protected final Logger logger;
    private final GmlcPropertiesManagement wrappedGmlcPropertiesManagement;
  //  private final GmlcManagementJmx sctpManagement;

    public GmlcPropertiesManagementJmx(GmlcPropertiesManagement wrappedGmlcPropertiesManagement) {
    //    this.ss7Management = ss7Management;
        this.wrappedGmlcPropertiesManagement = wrappedGmlcPropertiesManagement;

        this.logger = Logger.getLogger(GmlcPropertiesManagementJmx.class.getCanonicalName() + "-" + wrappedGmlcPropertiesManagement.getName());
    }



    @Override
    public String getGmlcGt() {
        return this.wrappedGmlcPropertiesManagement.getGmlcGt();
    }


    @Override
    public void setGmlcGt(String serviceCentreGt) {
        this.wrappedGmlcPropertiesManagement.setGmlcGt(serviceCentreGt);
    }


    @Override
    public int getGmlcSsn() {
        return this.wrappedGmlcPropertiesManagement.getGmlcSsn();
    }


    @Override
    public void setGmlcSsn(int serviceCentreSsn) {
        this.wrappedGmlcPropertiesManagement
         .setGmlcSsn(serviceCentreSsn);
    }

    @Override
    public int getHlrSsn() {
        return this.wrappedGmlcPropertiesManagement.getHlrSsn();
    }


    @Override
    public void setHlrSsn(int hlrSsn) {
        this.wrappedGmlcPropertiesManagement.setHlrSsn(hlrSsn);
    }

    @Override
    public int getMscSsn() {
        return this.wrappedGmlcPropertiesManagement.getMscSsn();
    }


    @Override
    public void setMscSsn(int mscSsn) {
        this.wrappedGmlcPropertiesManagement.setMscSsn(mscSsn);
    }

    @Override
    public int getMaxMapVersion() {
        return this.wrappedGmlcPropertiesManagement.getMaxMapVersion();
    }

    @Override
    public void setMaxMapVersion(int maxMapVersion) {
        this.wrappedGmlcPropertiesManagement.setMaxMapVersion(maxMapVersion);
    }

    @Override
    public long getDialogTimeout() {
        return this.wrappedGmlcPropertiesManagement.getDialogTimeout();
    }

    @Override
    public void setDialogTimeout(long dialogTimeout) {
        this.wrappedGmlcPropertiesManagement.setDialogTimeout(dialogTimeout);
    }

    @Override
    public int getMaxActivityCount() {
        return this.wrappedGmlcPropertiesManagement.getMaxActivityCount();
    }

    @Override
    public void setMaxActivityCount(int maxActivityCount) {
        this.wrappedGmlcPropertiesManagement.setMaxMapVersion(maxActivityCount);
    }


    @Override
    public String getServerOverloadedMessage() {
        return this
	.wrappedGmlcPropertiesManagement.getServerOverloadedMessage();
    }


    @Override
    public void setServerOverloadedMessage(String serverOverloadedMessage) {
        this
	.wrappedGmlcPropertiesManagement
	.setServerOverloadedMessage(serverOverloadedMessage);
    }

    @Override
    public String getServerErrorMessage() {
        return this.wrappedGmlcPropertiesManagement
	.getServerErrorMessage();
    }


    @Override
    public void setServerErrorMessage(String serverErrorMessage) {
        this
	.wrappedGmlcPropertiesManagement
	.setServerErrorMessage(serverErrorMessage);
    }

    @Override
    public String getDialogTimeoutErrorMessage() {
        return this
	.wrappedGmlcPropertiesManagement
        .getDialogTimeoutErrorMessage();
    }


    @Override
    public void setDialogTimeoutErrorMessage(String dialogTimeoutErrorMessage) {
        this
	.wrappedGmlcPropertiesManagement
        .setDialogTimeoutErrorMessage(dialogTimeoutErrorMessage);
    }

}
