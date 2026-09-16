package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: ۥٖؖؗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1473 {

    /* JADX INFO: renamed from: ۥؗ */
    public static volatile InterfaceC4727 f5010;

    /* JADX INFO: renamed from: ۥُ */
    public static Context f5011;

    /* JADX INFO: renamed from: ۥۗ */
    public static final BinderC4002 f5012;

    /* JADX INFO: renamed from: ۥۣ */
    public static final BinderC4002 f5013;

    /* JADX INFO: renamed from: ۦؑ */
    public static final Object f5014;

    static {
        new BinderC4002(0, AbstractBinderC4737.m8059("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new BinderC4002(1, AbstractBinderC4737.m8059("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new BinderC4002(2, AbstractBinderC4737.m8059("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new BinderC4002(3, AbstractBinderC4737.m8059("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f5013 = new BinderC4002(4, AbstractBinderC4737.m8059("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f5012 = new BinderC4002(5, AbstractBinderC4737.m8059("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f5014 = new Object();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C5470 m3088(String str, BinderC4567 binderC4567, boolean z, boolean z2) {
        try {
            m3089();
            AbstractC0487.m1047(f5011);
            try {
                InterfaceC4727 interfaceC4727 = f5010;
                BinderC1409 binderC1409 = new BinderC1409(f5011.getPackageManager());
                C4095 c4095 = (C4095) interfaceC4727;
                Parcel parcelM7504 = c4095.m7504();
                int i = AbstractC3419.f11378;
                boolean z3 = true;
                parcelM7504.writeInt(1);
                int iM7800 = AbstractC4489.m7800(parcelM7504, 20293);
                AbstractC4489.m7775(parcelM7504, 1, str);
                AbstractC4489.m7802(parcelM7504, 2, binderC4567);
                AbstractC4489.m7797(parcelM7504, 3, 4);
                parcelM7504.writeInt(z ? 1 : 0);
                AbstractC4489.m7797(parcelM7504, 4, 4);
                parcelM7504.writeInt(z2 ? 1 : 0);
                AbstractC4489.m7790(parcelM7504, iM7800);
                AbstractC3419.m6198(parcelM7504, binderC1409);
                Parcel parcelM7508 = c4095.m7508(parcelM7504, 5);
                if (parcelM7508.readInt() == 0) {
                    z3 = false;
                }
                parcelM7508.recycle();
                return z3 ? C5470.f18033 : new C1253(new CallableC3360(z, str, binderC4567));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C5470.m9155("module call", e);
            }
        } catch (C2784 e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return C5470.m9155("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m3089() {
        InterfaceC4727 c4095;
        if (f5010 != null) {
            return;
        }
        AbstractC0487.m1047(f5011);
        synchronized (f5014) {
            try {
                if (f5010 == null) {
                    IBinder iBinderM4525 = C2401.m4518(f5011, C2401.f7997, "com.google.android.gms.googlecertificates").m4525("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = AbstractBinderC2709.f8976;
                    if (iBinderM4525 == null) {
                        c4095 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM4525.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        c4095 = iInterfaceQueryLocalInterface instanceof InterfaceC4727 ? (InterfaceC4727) iInterfaceQueryLocalInterface : new C4095(iBinderM4525, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
                    }
                    f5010 = c4095;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
