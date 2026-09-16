package p000;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦٕٗؒٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4350 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ boolean f14340;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ String f14341;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C5855 f14342;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C5695 f14343;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ Object f14344;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ String f14345;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14346 = 0;

    public RunnableC4350(C5695 c5695, String str, String str2, C5855 c5855, boolean z, InterfaceC3838 interfaceC3838) {
        this.f14345 = str;
        this.f14341 = str2;
        this.f14342 = c5855;
        this.f14340 = z;
        this.f14344 = interfaceC3838;
        this.f14343 = c5695;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C1512 c1512;
        AtomicReference atomicReference;
        switch (this.f14346) {
            case 0:
                String str = this.f14341;
                String str2 = this.f14345;
                InterfaceC3838 interfaceC3838 = (InterfaceC3838) this.f14344;
                C5695 c5695 = this.f14343;
                C5371 c5371 = (C5371) c5695.f18660;
                Bundle bundle = new Bundle();
                try {
                    try {
                        InterfaceC5253 interfaceC5253 = c5695.f18733;
                        if (interfaceC5253 == null) {
                            C3610 c3610 = c5371.f17717;
                            C5371.m9020(c3610);
                            c3610.f12020.m9434(str2, str, "Failed to get user properties; not connected to service");
                            c1512 = c5371.f17721;
                            C5371.m9021(c1512);
                            c1512.m3238(interfaceC3838, bundle);
                            return;
                        }
                        List<C1477> listMo6918 = interfaceC5253.mo6918(str2, str, this.f14340, this.f14342);
                        Bundle bundle2 = new Bundle();
                        if (listMo6918 != null) {
                            for (C1477 c1477 : listMo6918) {
                                String str3 = c1477.f5020;
                                String str4 = c1477.f5025;
                                if (str3 != null) {
                                    bundle2.putString(str4, str3);
                                } else {
                                    Long l = c1477.f5022;
                                    if (l != null) {
                                        bundle2.putLong(str4, l.longValue());
                                    } else {
                                        Double d = c1477.f5024;
                                        if (d != null) {
                                            bundle2.putDouble(str4, d.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            c5695.m9520();
                            C1512 c1513 = c5371.f17721;
                            C5371.m9021(c1513);
                            c1513.m3238(interfaceC3838, bundle2);
                            return;
                        } catch (RemoteException e) {
                            e = e;
                            bundle = bundle2;
                            C3610 c3611 = c5371.f17717;
                            C5371.m9020(c3611);
                            c3611.f12020.m9434(str2, e, "Failed to get user properties; remote exception");
                            c1512 = c5371.f17721;
                            C5371.m9021(c1512);
                            c1512.m3238(interfaceC3838, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bundle = bundle2;
                            C1512 c1514 = c5371.f17721;
                            C5371.m9021(c1514);
                            c1514.m3238(interfaceC3838, bundle);
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f14344;
                synchronized (atomicReference2) {
                    try {
                        try {
                            C5695 c5696 = this.f14343;
                            InterfaceC5253 interfaceC5254 = c5696.f18733;
                            if (interfaceC5254 == null) {
                                C3610 c3612 = ((C5371) c5696.f18660).f17717;
                                C5371.m9020(c3612);
                                c3612.f12020.m9431("(legacy) Failed to get user properties; not connected to service", null, this.f14345, this.f14341);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(interfaceC5254.mo6918(this.f14345, this.f14341, this.f14340, this.f14342));
                            } else {
                                atomicReference2.set(interfaceC5254.mo6916(null, this.f14345, this.f14341, this.f14340));
                            }
                            c5696.m9520();
                            atomicReference = (AtomicReference) this.f14344;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e3) {
                            C3610 c3613 = ((C5371) this.f14343.f18660).f17717;
                            C5371.m9020(c3613);
                            c3613.f12020.m9431("(legacy) Failed to get user properties; remote exception", null, this.f14345, e3);
                            ((AtomicReference) this.f14344).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f14344;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f14344).notify();
                        throw th3;
                    }
                }
                break;
        }
    }

    public RunnableC4350(C5695 c5695, AtomicReference atomicReference, String str, String str2, C5855 c5855, boolean z) {
        this.f14344 = atomicReference;
        this.f14345 = str;
        this.f14341 = str2;
        this.f14342 = c5855;
        this.f14340 = z;
        this.f14343 = c5695;
    }
}
