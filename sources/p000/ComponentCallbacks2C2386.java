package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ۥًۜؕۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2386 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: ۥَ */
    public boolean f7912 = true;

    /* JADX INFO: renamed from: ۥْ */
    public InterfaceC3463 f7913;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f7914;

    /* JADX INFO: renamed from: ۦ۟ */
    public Context f7915;

    /* JADX INFO: renamed from: ۦۨ */
    public final WeakReference f7916;

    public ComponentCallbacks2C2386(C1199 c1199) {
        this.f7916 = new WeakReference(c1199);
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        try {
            if ((((C1199) this.f7916.get()) != null ? C2358.f7817 : null) == null) {
                m4462();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        C2358 c2358;
        try {
            C1199 c1199 = (C1199) this.f7916.get();
            if (c1199 != null) {
                C4475 c4475 = (C4475) c1199.f4128.getValue();
                if (c4475 != null) {
                    c4475.f14775.mo4406(i);
                    C0322 c0322 = c4475.f14774;
                    synchronized (c0322) {
                        if (i >= 10 && i != 20) {
                            c0322.m688();
                        }
                    }
                }
                c2358 = C2358.f7817;
            } else {
                c2358 = null;
            }
            if (c2358 == null) {
                m4462();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final synchronized void m4462() {
        try {
            if (this.f7914) {
                return;
            }
            this.f7914 = true;
            Context context = this.f7915;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            InterfaceC3463 interfaceC3463 = this.f7913;
            if (interfaceC3463 != null) {
                interfaceC3463.shutdown();
            }
            this.f7916.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final synchronized void m4463() {
        C2358 c2358;
        InterfaceC3463 c4992;
        try {
            C1199 c1199 = (C1199) this.f7916.get();
            if (c1199 != null) {
                if (this.f7913 == null) {
                    Context context = c1199.f4132;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    if (connectivityManager == null || AbstractC4225.m7487(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        c4992 = new C4992(8);
                    } else {
                        try {
                            c4992 = new C2808(connectivityManager, this);
                        } catch (Exception unused) {
                            c4992 = new C4992(8);
                        }
                    }
                    this.f7913 = c4992;
                    this.f7912 = c4992.mo5347();
                }
                c2358 = C2358.f7817;
            } else {
                c2358 = null;
            }
            if (c2358 == null) {
                m4462();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
