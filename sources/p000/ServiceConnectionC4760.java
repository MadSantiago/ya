package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦٝؖٝؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC4760 implements ServiceConnection {

    /* JADX INFO: renamed from: ۥَ */
    public final C5148 f15703;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f15704;

    /* JADX INFO: renamed from: ۥٓ */
    public IBinder f15705;

    /* JADX INFO: renamed from: ۥٖ */
    public ComponentName f15706;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C3827 f15707;

    /* JADX INFO: renamed from: ۦۨ */
    public final HashMap f15709 = new HashMap();

    /* JADX INFO: renamed from: ۦ۟ */
    public int f15708 = 2;

    public ServiceConnectionC4760(C3827 c3827, C5148 c5148) {
        this.f15707 = c3827;
        this.f15703 = c5148;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3827 c3827 = this.f15707;
        synchronized (c3827.f12691) {
            try {
                c3827.f12687.removeMessages(1, this.f15703);
                this.f15705 = iBinder;
                this.f15706 = componentName;
                Iterator it = this.f15709.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f15708 = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C3827 c3827 = this.f15707;
        synchronized (c3827.f12691) {
            try {
                c3827.f12687.removeMessages(1, this.f15703);
                this.f15705 = null;
                this.f15706 = componentName;
                Iterator it = this.f15709.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f15708 = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C2612 m8110(String str, Executor executor) {
        try {
            Intent intentM4539 = AbstractC2418.m4539(this.f15707.f12690, this.f15703);
            this.f15708 = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(AbstractC5753.m9574(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                C3827 c3827 = this.f15707;
                C4601 c4601 = c3827.f12692;
                Context context = c3827.f12690;
                C5148 c5148 = this.f15703;
                boolean zM8001 = c4601.m8001(context, str, intentM4539, this, 4225, executor);
                this.f15704 = zM8001;
                if (zM8001) {
                    c3827.f12687.sendMessageDelayed(c3827.f12687.obtainMessage(1, c5148), c3827.f12689);
                    return C2612.f8709;
                }
                this.f15708 = 2;
                try {
                    c3827.f12692.m8002(c3827.f12690, this);
                } catch (IllegalArgumentException unused) {
                }
                return new C2612(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (C2627 e) {
            return e.f8735;
        }
    }
}
