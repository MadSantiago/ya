package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۥۣؒؗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0282 extends ContextWrapper {

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f1030 = "com.topjohnwu.superuser.DAEMON_MODE";

    /* JADX INFO: renamed from: ۥؗ */
    public static InterfaceC0964 m591(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        C3368 c3368 = C3368.f11247;
        if (c3368 == null) {
            c3368 = new C3368();
            C3368.f11247 = c3368;
        }
        C5459 c5459M6125 = c3368.m6125(intent, executor, serviceConnection);
        if (c5459M6125 == null) {
            return null;
        }
        c3368.f11253.add(new C3412(c3368, intent, executor, serviceConnection));
        int i = ((Boolean) ((Pair) c5459M6125).second).booleanValue() ? 2 : 1;
        int i2 = c3368.f11248;
        if ((i2 & i) != 0) {
            return null;
        }
        c3368.f11248 = i | i2;
        return c3368.m6126((ComponentName) ((Pair) c5459M6125).first, ((Boolean) ((Pair) c5459M6125).second).booleanValue() ? "daemon" : "start");
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m592(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        InterfaceC0964 interfaceC0964M591;
        if (AbstractC2774.m5206() || (interfaceC0964M591 = m591(intent, executor, serviceConnection)) == null) {
            return;
        }
        C3267.f10970.execute(new RunnableC0029(15, interfaceC0964M591));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m593(Intent intent, ServiceConnection serviceConnection) {
        m592(intent, AbstractC1436.f4923, serviceConnection);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۦؑ */
    public static Runnable m594(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        InterfaceC0964 interfaceC0964M591 = m591(intent, executor, serviceConnection);
        if (interfaceC0964M591 == null) {
            return null;
        }
        return new RunnableC0029(15, interfaceC0964M591);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static void m595(Intent intent) {
        InterfaceC0964 interfaceC0964M596;
        if (AbstractC2774.m5206() || (interfaceC0964M596 = m596(intent)) == null) {
            return;
        }
        C3267.f10970.execute(new RunnableC0029(15, interfaceC0964M596));
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static InterfaceC0964 m596(Intent intent) {
        C3368 c3368 = C3368.f11247;
        if (c3368 == null) {
            c3368 = new C3368();
            C3368.f11247 = c3368;
        }
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            C1078.m2276("This method can only be called on the main thread");
            return null;
        }
        C5459 c5459M6123 = C3368.m6123(intent);
        C3209 c3209 = ((Boolean) ((Pair) c5459M6123).second).booleanValue() ? c3368.f11251 : c3368.f11252;
        if (c3209 == null) {
            if (((Boolean) ((Pair) c5459M6123).second).booleanValue()) {
                return c3368.m6126((ComponentName) ((Pair) c5459M6123).first, "stop");
            }
            return null;
        }
        try {
            c3209.f10767.mo1581(-1, (ComponentName) ((Pair) c5459M6123).first);
        } catch (RemoteException e) {
            AbstractC2774.m5205("IPC", e);
        }
        c3368.m6124(c5459M6123);
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static void m597(ServiceConnection serviceConnection) {
        C3368 c3368 = C3368.f11247;
        if (c3368 == null) {
            c3368 = new C3368();
            C3368.f11247 = c3368;
        }
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            C1078.m2276("This method can only be called on the main thread");
            return;
        }
        C2087 c2087 = (C2087) c3368.f11250.remove(serviceConnection);
        if (c2087 != null) {
            C1356 c1356 = (C1356) ((Pair) c2087).first;
            int i = c1356.f4663;
            C5459 c5459 = c1356.f4662;
            int i2 = i - 1;
            c1356.f4663 = i2;
            if (i2 == 0) {
                c3368.f11249.remove(c5459);
                try {
                    c1356.f4660.f10767.mo1582((ComponentName) ((Pair) c5459).first);
                } catch (RemoteException e) {
                    AbstractC2774.m5205("IPC", e);
                }
            }
            c2087.m4027(serviceConnection);
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        super.attachBaseContext(m599(baseContext));
        BinderC4778 binderC4778 = BinderC4778.f15758;
        if (binderC4778 == null) {
            binderC4778 = new BinderC4778(context);
            BinderC4778.f15758 = binderC4778;
        }
        binderC4778.f15761.put(m598(), new C1137(this));
        m600();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return AbstractC2774.f9240;
    }

    /* JADX INFO: renamed from: ۥُ */
    public ComponentName m598() {
        return new ComponentName(this, getClass());
    }

    /* JADX INFO: renamed from: ۦۗ */
    public boolean m603(Intent intent) {
        return false;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public abstract IBinder mo604(Intent intent);

    /* JADX INFO: renamed from: ۦۚ */
    public final void m605() {
        BinderC4778 binderC4778 = BinderC4778.f15758;
        if (binderC4778 == null) {
            binderC4778 = new BinderC4778(this);
            BinderC4778.f15758 = binderC4778;
        }
        AbstractC1436.m3064(new RunnableC5585(binderC4778, m598(), 0));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public void m600() {
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void m602() {
    }

    /* JADX INFO: renamed from: ۥّ */
    public Context m599(Context context) {
        return context;
    }

    /* JADX INFO: renamed from: ۦِ */
    public void m601(Intent intent) {
    }
}
