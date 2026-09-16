package p000;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦَ٘ؕ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4438 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f14630;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5855 f14631;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f14632;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Object f14633;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ String f14634;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14635 = 0;

    public /* synthetic */ RunnableC4438(BinderC5179 binderC5179, C5855 c5855, Bundle bundle, InterfaceC0415 interfaceC0415, String str) {
        this.f14632 = binderC5179;
        this.f14631 = c5855;
        this.f14630 = bundle;
        this.f14633 = interfaceC0415;
        this.f14634 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C1512 c1512;
        switch (this.f14635) {
            case 0:
                BinderC5179 binderC5179 = (BinderC5179) this.f14632;
                C5855 c5855 = this.f14631;
                Bundle bundle = (Bundle) this.f14630;
                InterfaceC0415 interfaceC0415 = (InterfaceC0415) this.f14633;
                String str = this.f14634;
                C5034 c5034 = binderC5179.f17131;
                c5034.m8494();
                try {
                    interfaceC0415.mo925(c5034.m8507(bundle, c5855));
                    return;
                } catch (RemoteException e) {
                    c5034.mo2404().f12020.m9434(str, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.f14632;
                synchronized (atomicReference2) {
                    try {
                        try {
                            C5695 c5695 = (C5695) this.f14633;
                            InterfaceC5253 interfaceC5253 = c5695.f18733;
                            if (interfaceC5253 == null) {
                                C3610 c3610 = ((C5371) c5695.f18660).f17717;
                                C5371.m9020(c3610);
                                c3610.f12020.m9431("(legacy) Failed to get conditional properties; not connected to service", null, this.f14634, (String) this.f14630);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(interfaceC5253.mo6915(this.f14634, (String) this.f14630, this.f14631));
                            } else {
                                atomicReference2.set(interfaceC5253.mo6914(null, this.f14634, (String) this.f14630));
                            }
                            c5695.m9520();
                            atomicReference = (AtomicReference) this.f14632;
                            atomicReference.notify();
                            return;
                        } catch (Throwable th) {
                            ((AtomicReference) this.f14632).notify();
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        C3610 c3611 = ((C5371) ((C5695) this.f14633).f18660).f17717;
                        C5371.m9020(c3611);
                        c3611.f12020.m9431("(legacy) Failed to get conditional properties; remote exception", null, this.f14634, e2);
                        ((AtomicReference) this.f14632).set(Collections.EMPTY_LIST);
                        atomicReference = (AtomicReference) this.f14632;
                    }
                }
                break;
            default:
                InterfaceC3838 interfaceC3838 = (InterfaceC3838) this.f14630;
                String str2 = (String) this.f14632;
                String str3 = this.f14634;
                C5695 c5696 = (C5695) this.f14633;
                C5371 c5371 = (C5371) c5696.f18660;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        InterfaceC5253 interfaceC5254 = c5696.f18733;
                        if (interfaceC5254 == null) {
                            C3610 c3612 = c5371.f17717;
                            C5371.m9020(c3612);
                            c3612.f12020.m9434(str3, str2, "Failed to get conditional properties; not connected to service");
                            c1512 = c5371.f17721;
                        } else {
                            arrayList = C1512.m3200(interfaceC5254.mo6915(str3, str2, this.f14631));
                            c5696.m9520();
                            c1512 = c5371.f17721;
                        }
                    } catch (RemoteException e3) {
                        C3610 c3613 = c5371.f17717;
                        C5371.m9020(c3613);
                        c3613.f12020.m9431("Failed to get conditional properties; remote exception", str3, str2, e3);
                    }
                    C5371.m9021(c1512);
                    c1512.m3217(interfaceC3838, arrayList);
                    return;
                } catch (Throwable th2) {
                    C1512 c1513 = c5371.f17721;
                    C5371.m9021(c1513);
                    c1513.m3217(interfaceC3838, arrayList);
                    throw th2;
                }
        }
    }

    public RunnableC4438(C5695 c5695, String str, String str2, C5855 c5855, InterfaceC3838 interfaceC3838) {
        this.f14634 = str;
        this.f14632 = str2;
        this.f14631 = c5855;
        this.f14630 = interfaceC3838;
        this.f14633 = c5695;
    }

    public RunnableC4438(C5695 c5695, AtomicReference atomicReference, String str, String str2, C5855 c5855) {
        this.f14632 = atomicReference;
        this.f14634 = str;
        this.f14630 = str2;
        this.f14631 = c5855;
        this.f14633 = c5695;
    }
}
