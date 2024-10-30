package main;

public class VoterProxy implements main.Voter {
  private String _endpoint = null;
  private main.Voter voter = null;
  
  public VoterProxy() {
    _initVoterProxy();
  }
  
  public VoterProxy(String endpoint) {
    _endpoint = endpoint;
    _initVoterProxy();
  }
  
  private void _initVoterProxy() {
    try {
      voter = (new main.VoterServiceLocator()).getVoter();
      if (voter != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)voter)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)voter)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (voter != null)
      ((javax.xml.rpc.Stub)voter)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Voter getVoter() {
    if (voter == null)
      _initVoterProxy();
    return voter;
  }
  
  public void voter(java.lang.String name, java.lang.String cnic, java.lang.String qualification, java.lang.String state_Number, java.lang.String organization, java.lang.String post) throws java.rmi.RemoteException{
    if (voter == null)
      _initVoterProxy();
    voter.voter(name, cnic, qualification, state_Number, organization, post);
  }
  
  
}