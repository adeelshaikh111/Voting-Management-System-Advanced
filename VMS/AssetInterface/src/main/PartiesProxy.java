package main;

public class PartiesProxy implements main.Parties {
  private String _endpoint = null;
  private main.Parties parties = null;
  
  public PartiesProxy() {
    _initPartiesProxy();
  }
  
  public PartiesProxy(String endpoint) {
    _endpoint = endpoint;
    _initPartiesProxy();
  }
  
  private void _initPartiesProxy() {
    try {
      parties = (new main.PartiesServiceLocator()).getParties();
      if (parties != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)parties)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)parties)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (parties != null)
      ((javax.xml.rpc.Stub)parties)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Parties getParties() {
    if (parties == null)
      _initPartiesProxy();
    return parties;
  }
  
  public java.lang.String getPartyinfo(java.lang.String party_name) throws java.rmi.RemoteException{
    if (parties == null)
      _initPartiesProxy();
    return parties.getPartyinfo(party_name);
  }
  
  
}