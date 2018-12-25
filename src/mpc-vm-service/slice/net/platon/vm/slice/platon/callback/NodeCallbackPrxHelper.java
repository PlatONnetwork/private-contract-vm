// **********************************************************************
//
// Copyright (c) 2003-2018 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.4
//
// <auto-generated>
//
// Generated from file `platon_mpc_service.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package net.platon.vm.slice.platon.callback;

/**
 * Provides type-specific helper functions.
 **/
public final class NodeCallbackPrxHelper extends Ice.ObjectPrxHelperBase implements NodeCallbackPrx
{
    private static final String __invite_name = "invite";

    public void invite(String taskid, int status)
    {
        invite(taskid, status, null, false);
    }

    public void invite(String taskid, int status, java.util.Map<String, String> __ctx)
    {
        invite(taskid, status, __ctx, true);
    }

    private void invite(String taskid, int status, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_invite(begin_invite(taskid, status, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_invite(String taskid, int status)
    {
        return begin_invite(taskid, status, null, false, false, null);
    }

    public Ice.AsyncResult begin_invite(String taskid, int status, java.util.Map<String, String> __ctx)
    {
        return begin_invite(taskid, status, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_invite(String taskid, int status, Ice.Callback __cb)
    {
        return begin_invite(taskid, status, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_invite(String taskid, int status, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_invite(taskid, status, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_invite(String taskid, int status, Callback_NodeCallback_invite __cb)
    {
        return begin_invite(taskid, status, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_invite(String taskid, int status, java.util.Map<String, String> __ctx, Callback_NodeCallback_invite __cb)
    {
        return begin_invite(taskid, status, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_invite(String taskid, 
                                        int status, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_invite(taskid, status, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_invite(String taskid, 
                                        int status, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_invite(taskid, status, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_invite(String taskid, 
                                        int status, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_invite(taskid, status, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_invite(String taskid, 
                                        int status, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_invite(taskid, status, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_invite(String taskid, 
                                         int status, 
                                         java.util.Map<String, String> __ctx, 
                                         boolean __explicitCtx, 
                                         boolean __synchronous, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_invite(taskid, 
                            status, 
                            __ctx, 
                            __explicitCtx, 
                            __synchronous, 
                            new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_invite(String taskid, 
                                         int status, 
                                         java.util.Map<String, String> __ctx, 
                                         boolean __explicitCtx, 
                                         boolean __synchronous, 
                                         IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__invite_name, __cb);
        try
        {
            __result.prepare(__invite_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(taskid);
            __os.writeInt(status);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_invite(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __invite_name);
    }

    private static final String __notify_name = "notify";

    public void _notify(String taskid, int status)
    {
        _notify(taskid, status, null, false);
    }

    public void _notify(String taskid, int status, java.util.Map<String, String> __ctx)
    {
        _notify(taskid, status, __ctx, true);
    }

    private void _notify(String taskid, int status, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_notify(begin_notify(taskid, status, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_notify(String taskid, int status)
    {
        return begin_notify(taskid, status, null, false, false, null);
    }

    public Ice.AsyncResult begin_notify(String taskid, int status, java.util.Map<String, String> __ctx)
    {
        return begin_notify(taskid, status, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_notify(String taskid, int status, Ice.Callback __cb)
    {
        return begin_notify(taskid, status, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_notify(String taskid, int status, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_notify(taskid, status, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_notify(String taskid, int status, Callback_NodeCallback_notify __cb)
    {
        return begin_notify(taskid, status, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_notify(String taskid, int status, java.util.Map<String, String> __ctx, Callback_NodeCallback_notify __cb)
    {
        return begin_notify(taskid, status, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_notify(String taskid, 
                                        int status, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_notify(taskid, status, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_notify(String taskid, 
                                        int status, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_notify(taskid, status, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_notify(String taskid, 
                                        int status, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_notify(taskid, status, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_notify(String taskid, 
                                        int status, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_notify(taskid, status, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_notify(String taskid, 
                                         int status, 
                                         java.util.Map<String, String> __ctx, 
                                         boolean __explicitCtx, 
                                         boolean __synchronous, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_notify(taskid, 
                            status, 
                            __ctx, 
                            __explicitCtx, 
                            __synchronous, 
                            new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_notify(String taskid, 
                                         int status, 
                                         java.util.Map<String, String> __ctx, 
                                         boolean __explicitCtx, 
                                         boolean __synchronous, 
                                         IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__notify_name, __cb);
        try
        {
            __result.prepare(__notify_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(taskid);
            __os.writeInt(status);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_notify(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __notify_name);
    }

    private static final String __ready_name = "ready";

    public void ready(String taskid, int status)
    {
        ready(taskid, status, null, false);
    }

    public void ready(String taskid, int status, java.util.Map<String, String> __ctx)
    {
        ready(taskid, status, __ctx, true);
    }

    private void ready(String taskid, int status, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_ready(begin_ready(taskid, status, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_ready(String taskid, int status)
    {
        return begin_ready(taskid, status, null, false, false, null);
    }

    public Ice.AsyncResult begin_ready(String taskid, int status, java.util.Map<String, String> __ctx)
    {
        return begin_ready(taskid, status, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_ready(String taskid, int status, Ice.Callback __cb)
    {
        return begin_ready(taskid, status, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_ready(String taskid, int status, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_ready(taskid, status, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_ready(String taskid, int status, Callback_NodeCallback_ready __cb)
    {
        return begin_ready(taskid, status, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_ready(String taskid, int status, java.util.Map<String, String> __ctx, Callback_NodeCallback_ready __cb)
    {
        return begin_ready(taskid, status, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_ready(String taskid, 
                                       int status, 
                                       IceInternal.Functional_VoidCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_ready(taskid, status, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_ready(String taskid, 
                                       int status, 
                                       IceInternal.Functional_VoidCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_ready(taskid, status, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_ready(String taskid, 
                                       int status, 
                                       java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_VoidCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_ready(taskid, status, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_ready(String taskid, 
                                       int status, 
                                       java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_VoidCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_ready(taskid, status, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_ready(String taskid, 
                                        int status, 
                                        java.util.Map<String, String> __ctx, 
                                        boolean __explicitCtx, 
                                        boolean __synchronous, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_ready(taskid, 
                           status, 
                           __ctx, 
                           __explicitCtx, 
                           __synchronous, 
                           new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_ready(String taskid, 
                                        int status, 
                                        java.util.Map<String, String> __ctx, 
                                        boolean __explicitCtx, 
                                        boolean __synchronous, 
                                        IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__ready_name, __cb);
        try
        {
            __result.prepare(__ready_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(taskid);
            __os.writeInt(status);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_ready(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __ready_name);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static NodeCallbackPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), NodeCallbackPrx.class, NodeCallbackPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static NodeCallbackPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), NodeCallbackPrx.class, NodeCallbackPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static NodeCallbackPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), NodeCallbackPrx.class, NodeCallbackPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static NodeCallbackPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), NodeCallbackPrx.class, NodeCallbackPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static NodeCallbackPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, NodeCallbackPrx.class, NodeCallbackPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static NodeCallbackPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, NodeCallbackPrx.class, NodeCallbackPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::platon::callback::NodeCallback"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, NodeCallbackPrx v)
    {
        __os.writeProxy(v);
    }

    public static NodeCallbackPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            NodeCallbackPrxHelper result = new NodeCallbackPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
