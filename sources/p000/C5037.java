package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: ۦًۣۘؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5037 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f16703;

    /* JADX INFO: renamed from: ۥُ */
    public C3395 f16704;

    /* JADX INFO: renamed from: ۥّ */
    public final Context f16705;

    /* JADX INFO: renamed from: ۥۗ */
    public InterfaceC0149 f16706;

    /* JADX INFO: renamed from: ۥۣ */
    public ServiceConnectionC4499 f16707;

    /* JADX INFO: renamed from: ۦؑ */
    public final Object f16708 = new Object();

    /* JADX INFO: renamed from: ۦۙ */
    public final long f16709;

    public C5037(Context context) {
        AbstractC0487.m1047(context);
        Context applicationContext = context.getApplicationContext();
        this.f16705 = applicationContext != null ? applicationContext : context;
        this.f16703 = false;
        this.f16709 = -1L;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C0946 m8546(Context context) {
        C5037 c5037 = new C5037(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c5037.m8548();
            C0946 c0946M8549 = c5037.m8549();
            m8547(c0946M8549, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            c5037.m8550();
            return c0946M8549;
        } catch (Throwable th) {
            try {
                m8547(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                c5037.m8550();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m8547(C0946 c0946, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (c0946 != null) {
                map.put("limit_ad_tracking", true != c0946.f3352 ? "0" : "1");
                String str = c0946.f3351;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new C4436(map).start();
        }
    }

    public final void finalize() throws Throwable {
        m8550();
        super.finalize();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m8548() {
        AbstractC0487.m1093("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f16703) {
                    m8550();
                }
                Context context = this.f16705;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iM1308 = C0600.f2225.m1308(context, 12451000);
                    if (iM1308 != 0 && iM1308 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC4499 serviceConnectionC4499 = new ServiceConnectionC4499();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C4601.m8000().m8001(context, context.getClass().getName(), intent, serviceConnectionC4499, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f16707 = serviceConnectionC4499;
                        try {
                            IBinder iBinderM7828 = serviceConnectionC4499.m7828();
                            int i = AbstractBinderC1834.f6097;
                            IInterface iInterfaceQueryLocalInterface = iBinderM7828.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f16706 = iInterfaceQueryLocalInterface instanceof InterfaceC0149 ? (InterfaceC0149) iInterfaceQueryLocalInterface : new C4468(iBinderM7828);
                            this.f16703 = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C3754(0);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final C0946 m8549() {
        C0946 c0946;
        AbstractC0487.m1093("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f16703) {
                    synchronized (this.f16708) {
                        C3395 c3395 = this.f16704;
                        if (c3395 == null || !c3395.f11296) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        m8548();
                        if (!this.f16703) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                AbstractC0487.m1047(this.f16707);
                AbstractC0487.m1047(this.f16706);
                try {
                    C4468 c4468 = (C4468) this.f16706;
                    c4468.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel parcelM7745 = c4468.m7745(parcelObtain, 1);
                    String string = parcelM7745.readString();
                    parcelM7745.recycle();
                    C4468 c4469 = (C4468) this.f16706;
                    c4469.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = AbstractC5262.f17350;
                    parcelObtain2.writeInt(1);
                    Parcel parcelM7746 = c4469.m7745(parcelObtain2, 2);
                    if (parcelM7746.readInt() == 0) {
                        z = false;
                    }
                    parcelM7746.recycle();
                    c0946 = new C0946(0, string, z);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f16708) {
            C3395 c3396 = this.f16704;
            if (c3396 != null) {
                c3396.f11295.countDown();
                try {
                    this.f16704.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f16709;
            if (j > 0) {
                this.f16704 = new C3395(this, j);
            }
        }
        return c0946;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8550() {
        AbstractC0487.m1093("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f16705 == null || this.f16707 == null) {
                    return;
                }
                try {
                    if (this.f16703) {
                        C4601.m8000().m8002(this.f16705, this.f16707);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f16703 = false;
                this.f16706 = null;
                this.f16707 = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
