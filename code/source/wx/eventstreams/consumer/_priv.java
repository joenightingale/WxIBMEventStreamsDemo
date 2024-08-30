package wx.eventstreams.consumer;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class _priv

{
	// ---( internal utility methods )---

	final static _priv _instance = new _priv();

	static _priv _newInstance() { return new _priv(); }

	static _priv _cast(Object o) { return (_priv)o; }

	// ---( server methods )---




	public static final void cacheWSSessionId (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(cacheWSSessionId)>> ---
		// @sigtype java 3.5
		// [i] field:0:required sessionId
		// pipeline in
		IDataCursor pipelineCursor = pipeline.getCursor();
		String sessionId = IDataUtil.getString(pipelineCursor, "sessionId");
		pipelineCursor.destroy();
		
		
		if (sessionId != null) {
			if (sessionId.equals("null")) 
				_sessionId = null;
			else
				_sessionId = sessionId;
		}
		// --- <<IS-END>> ---

                
	}



	public static final void getWSSessionId (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getWSSessionId)>> ---
		// @sigtype java 3.5
		// [o] field:0:required sessionId
		// pipeline out
		IDataCursor pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "sessionId", _sessionId);
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}

	// --- <<IS-START-SHARED>> ---
	
	private static String _sessionId = null;
	// --- <<IS-END-SHARED>> ---
}

