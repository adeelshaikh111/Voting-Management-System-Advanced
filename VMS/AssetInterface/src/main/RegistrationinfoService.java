/**
 * RegistrationinfoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface RegistrationinfoService extends javax.xml.rpc.Service {
    public java.lang.String getRegistrationinfoAddress();

    public main.Registrationinfo getRegistrationinfo() throws javax.xml.rpc.ServiceException;

    public main.Registrationinfo getRegistrationinfo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
