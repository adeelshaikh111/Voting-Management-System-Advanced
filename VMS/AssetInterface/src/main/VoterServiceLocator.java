/**
 * VoterServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class VoterServiceLocator extends org.apache.axis.client.Service implements main.VoterService {

    public VoterServiceLocator() {
    }


    public VoterServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VoterServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Voter
    private java.lang.String Voter_address = "http://localhost:8080/voting_Management/services/Voter";

    public java.lang.String getVoterAddress() {
        return Voter_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VoterWSDDServiceName = "Voter";

    public java.lang.String getVoterWSDDServiceName() {
        return VoterWSDDServiceName;
    }

    public void setVoterWSDDServiceName(java.lang.String name) {
        VoterWSDDServiceName = name;
    }

    public main.Voter getVoter() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Voter_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVoter(endpoint);
    }

    public main.Voter getVoter(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.VoterSoapBindingStub _stub = new main.VoterSoapBindingStub(portAddress, this);
            _stub.setPortName(getVoterWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVoterEndpointAddress(java.lang.String address) {
        Voter_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Voter.class.isAssignableFrom(serviceEndpointInterface)) {
                main.VoterSoapBindingStub _stub = new main.VoterSoapBindingStub(new java.net.URL(Voter_address), this);
                _stub.setPortName(getVoterWSDDServiceName());
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
        if ("Voter".equals(inputPortName)) {
            return getVoter();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "VoterService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Voter"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Voter".equals(portName)) {
            setVoterEndpointAddress(address);
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
