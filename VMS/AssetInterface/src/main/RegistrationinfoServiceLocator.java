/**
 * RegistrationinfoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class RegistrationinfoServiceLocator extends org.apache.axis.client.Service implements main.RegistrationinfoService {

    public RegistrationinfoServiceLocator() {
    }


    public RegistrationinfoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RegistrationinfoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Registrationinfo
    private java.lang.String Registrationinfo_address = "http://localhost:8080/voting_Management/services/Registrationinfo";

    public java.lang.String getRegistrationinfoAddress() {
        return Registrationinfo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RegistrationinfoWSDDServiceName = "Registrationinfo";

    public java.lang.String getRegistrationinfoWSDDServiceName() {
        return RegistrationinfoWSDDServiceName;
    }

    public void setRegistrationinfoWSDDServiceName(java.lang.String name) {
        RegistrationinfoWSDDServiceName = name;
    }

    public main.Registrationinfo getRegistrationinfo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Registrationinfo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRegistrationinfo(endpoint);
    }

    public main.Registrationinfo getRegistrationinfo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.RegistrationinfoSoapBindingStub _stub = new main.RegistrationinfoSoapBindingStub(portAddress, this);
            _stub.setPortName(getRegistrationinfoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRegistrationinfoEndpointAddress(java.lang.String address) {
        Registrationinfo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Registrationinfo.class.isAssignableFrom(serviceEndpointInterface)) {
                main.RegistrationinfoSoapBindingStub _stub = new main.RegistrationinfoSoapBindingStub(new java.net.URL(Registrationinfo_address), this);
                _stub.setPortName(getRegistrationinfoWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Registrationinfo".equals(inputPortName)) {
            return getRegistrationinfo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "RegistrationinfoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Registrationinfo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Registrationinfo".equals(portName)) {
            setRegistrationinfoEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
