package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦؕ٘ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3310 {

    /* JADX INFO: renamed from: ۥؗ */
    public static int f11073 = -1;

    /* JADX INFO: renamed from: ۥُ */
    public static boolean f11074 = false;

    /* JADX INFO: renamed from: ۥّ */
    public static boolean f11075 = false;

    /* JADX INFO: renamed from: ۥۗ */
    public static InterfaceC1119 f11076 = null;

    /* JADX INFO: renamed from: ۥۜ */
    public static final C4058 f11077;

    /* JADX INFO: renamed from: ۥۣ */
    public static IBinder f11078 = null;

    /* JADX INFO: renamed from: ۦؑ */
    public static boolean f11079 = false;

    /* JADX INFO: renamed from: ۦؚ */
    public static final Handler f11080;

    /* JADX INFO: renamed from: ۦِ */
    public static final ArrayList f11081;

    /* JADX INFO: renamed from: ۦٛ */
    public static final ArrayList f11082;

    /* JADX INFO: renamed from: ۦۗ */
    public static final ArrayList f11083;

    /* JADX INFO: renamed from: ۦۙ */
    public static final BinderC3577 f11084;

    static {
        BinderC3577 binderC3577 = new BinderC3577();
        binderC3577.attachInterface(binderC3577, "moe.shizuku.server.IShizukuApplication");
        f11084 = binderC3577;
        f11077 = new C4058();
        f11082 = new ArrayList();
        f11081 = new ArrayList();
        f11083 = new ArrayList();
        f11080 = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static int m6079() {
        if (!f11079) {
            try {
                C5595 c5595 = (C5595) m6081();
                c5595.getClass();
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                    c5595.f18438.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    f11079 = z;
                    if (!z) {
                        return -1;
                    }
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            } catch (RemoteException e) {
                C5028.m8450(e);
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static boolean m6080() {
        IBinder iBinder = f11078;
        return iBinder != null && iBinder.pingBinder();
    }

    /* JADX INFO: renamed from: ۥّ */
    public static InterfaceC1119 m6081() {
        InterfaceC1119 interfaceC1119 = f11076;
        if (interfaceC1119 != null) {
            return interfaceC1119;
        }
        C1078.m2276("binder haven't been received");
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static boolean m6082(IBinder iBinder, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("shizuku:attach-api-version", 13);
        bundle.putString("shizuku:attach-package-name", str);
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            BinderC3577 binderC3577 = f11084;
            binderC3577.getClass();
            parcelObtain.writeStrongBinder(binderC3577);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            boolean zTransact = iBinder.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return zTransact;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static void m6083(C3268 c3268) {
        try {
            InterfaceC1119 interfaceC1119M6081 = m6081();
            c3268.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("shizuku:user-service-arg-component", c3268.f10982);
            String str = c3268.f10983;
            if (str != null) {
                bundle.putString("shizuku:user-service-arg-tag", str);
            }
            bundle.putBoolean("shizuku:user-service-remove", true);
            ((C5595) interfaceC1119M6081).m9435(null, bundle);
        } catch (RemoteException e) {
            C5028.m8450(e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static boolean m6084(IBinder iBinder, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            BinderC3577 binderC3577 = f11084;
            binderC3577.getClass();
            parcelObtain.writeStrongBinder(binderC3577);
            parcelObtain.writeString(str);
            boolean zTransact = iBinder.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return zTransact;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m6085(IBinder iBinder, String str) {
        InterfaceC1119 interfaceC1119;
        IBinder iBinder2 = f11078;
        if (iBinder2 == iBinder) {
            return;
        }
        if (iBinder == null) {
            f11078 = null;
            f11076 = null;
            f11073 = -1;
            synchronized (f11082) {
                try {
                    for (C3741 c3741 : f11081) {
                        c3741.getClass();
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            C2337.m4377();
                        } else {
                            f11080.post(new RunnableC4026((C2337) c3741.f12463));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iBinder2 != null) {
            iBinder2.unlinkToDeath(f11077, 0);
        }
        f11078 = iBinder;
        int i = AbstractBinderC1024.f3611;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("moe.shizuku.server.IShizukuService");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1119)) {
            C5595 c5595 = new C5595();
            c5595.f18438 = iBinder;
            interfaceC1119 = c5595;
        } else {
            interfaceC1119 = (InterfaceC1119) iInterfaceQueryLocalInterface;
        }
        f11076 = interfaceC1119;
        try {
            f11078.linkToDeath(f11077, 0);
        } catch (Throwable unused) {
            Log.i("ShizukuApplication", "attachApplication");
        }
        try {
            if (!m6082(f11078, str) && !m6084(f11078, str)) {
                f11075 = true;
            }
            Log.i("ShizukuApplication", "attachApplication");
        } catch (Throwable th2) {
            Log.w("ShizukuApplication", Log.getStackTraceString(th2));
        }
        if (f11075) {
            m6086();
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m6086() {
        ArrayList arrayList = f11082;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((C3741) it.next()).getClass();
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        throw new ClassCastException();
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
