package main;

public class RegistrationinfoProxy implements main.Registrationinfo {
  private String _endpoint = null;
  private main.Registrationinfo registrationinfo = null;
  
  public RegistrationinfoProxy() {
    _initRegistrationinfoProxy();
  }
  
  public RegistrationinfoProxy(String endpoint) {
    _endpoint = endpoint;
    _initRegistrationinfoProxy();
  }
  
  private void _initRegistrationinfoProxy() {
    try {
      registrationinfo = (new main.RegistrationinfoServiceLocator()).getRegistrationinfo();
      if (registrationinfo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)registrationinfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)registrationinfo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (registrationinfo != null)
      ((javax.xml.rpc.Stub)registrationinfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Registrationinfo getRegistrationinfo() {
    if (registrationinfo == null)
      _initRegistrationinfoProxy();
    return registrationinfo;
  }
  
  public void insert_info(java.lang.String cnic, java.lang.String password, java.lang.String name, java.lang.String dob) throws java.rmi.RemoteException{
    if (registrationinfo == null)
      _initRegistrationinfoProxy();
    registrationinfo.insert_info(cnic, password, name, dob);
  }
  
  
}