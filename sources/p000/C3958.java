package p000;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: ۦًِؓٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3958 implements Handler.Callback {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C3827 f13231;

    public /* synthetic */ C3958(C3827 c3827) {
        this.f13231 = c3827;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            C3827 c3827 = this.f13231;
            synchronized (c3827.f12691) {
                try {
                    C5148 c5148 = (C5148) message.obj;
                    ServiceConnectionC4760 serviceConnectionC4760 = (ServiceConnectionC4760) c3827.f12691.get(c5148);
                    if (serviceConnectionC4760 != null && serviceConnectionC4760.f15709.isEmpty()) {
                        if (serviceConnectionC4760.f15704) {
                            C5148 c5149 = serviceConnectionC4760.f15703;
                            C3827 c3828 = serviceConnectionC4760.f15707;
                            c3828.f12687.removeMessages(1, c5149);
                            c3828.f12692.m8002(c3828.f12690, serviceConnectionC4760);
                            serviceConnectionC4760.f15704 = false;
                            serviceConnectionC4760.f15708 = 2;
                        }
                        c3827.f12691.remove(c5148);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        C3827 c3829 = this.f13231;
        synchronized (c3829.f12691) {
            try {
                C5148 c51410 = (C5148) message.obj;
                ServiceConnectionC4760 serviceConnectionC4761 = (ServiceConnectionC4760) c3829.f12691.get(c51410);
                if (serviceConnectionC4761 != null && serviceConnectionC4761.f15708 == 3) {
                    String strValueOf = String.valueOf(c51410);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = serviceConnectionC4761.f15706;
                    if (componentName == null) {
                        c51410.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        c51410.getClass();
                        componentName = new ComponentName("com.google.android.gms", "unknown");
                    }
                    serviceConnectionC4761.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
