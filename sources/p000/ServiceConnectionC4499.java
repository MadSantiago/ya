package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: ۦٙؖؓۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC4499 implements ServiceConnection {

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f14873 = false;

    /* JADX INFO: renamed from: ۦ۟ */
    public final LinkedBlockingQueue f14872 = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f14872.add(iBinder);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final IBinder m7828() throws TimeoutException {
        AbstractC0487.m1093("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f14873) {
            C1078.m2276("Cannot call get on this connection more than once");
            return null;
        }
        this.f14873 = true;
        IBinder iBinder = (IBinder) this.f14872.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
