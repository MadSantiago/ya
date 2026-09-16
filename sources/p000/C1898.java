package p000;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥٝؕۛؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1898 implements InterfaceC1456, InterfaceC0891, InterfaceC2740 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C1795 f6279;

    public /* synthetic */ C1898(C1795 c1795) {
        this.f6279 = c1795;
    }

    @Override // p000.InterfaceC1456
    /* JADX INFO: renamed from: ۥُ */
    public void mo3079(C2202 c2202) {
        C1795 c1795 = this.f6279;
        synchronized (c1795) {
            try {
                if (((InterfaceC1456) c1795.f5992) instanceof C5643) {
                    ((ArrayList) c1795.f5994).add(c2202);
                }
                ((InterfaceC1456) c1795.f5992).mo3079(c2202);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2740
    /* JADX INFO: renamed from: ۥۗ */
    public void mo397(InterfaceC2090 interfaceC2090) {
        C1795 c1795 = this.f6279;
        C1397 c1397 = C1397.f4781;
        c1397.m2965("AnalyticsConnector now available.");
        InterfaceC4188 interfaceC4188 = (InterfaceC4188) interfaceC2090.get();
        int i = 16;
        C5086 c5086 = new C5086(i, interfaceC4188);
        boolean z = false;
        C5002 c5002 = new C5002(i, z);
        C0354 c0354 = (C0354) interfaceC4188;
        C1397 c1397M775 = c0354.m775("clx", c5002);
        if (c1397M775 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            c1397M775 = c0354.m775("crash", c5002);
            if (c1397M775 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (c1397M775 == null) {
            c1397.m2968("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        c1397.m2965("Registered Firebase Analytics listener.");
        C5086 c5087 = new C5086(8, z);
        C2808 c2808 = new C2808(c5086);
        synchronized (c1795) {
            try {
                Iterator it = ((ArrayList) c1795.f5994).iterator();
                while (it.hasNext()) {
                    c5087.mo3079((C2202) it.next());
                }
                c5002.f16550 = c5087;
                c5002.f16551 = c2808;
                c1795.f5992 = c5087;
                c1795.f5993 = c2808;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0891
    /* JADX INFO: renamed from: ۦۗ */
    public void mo1882(Bundle bundle) {
        ((InterfaceC0891) this.f6279.f5993).mo1882(bundle);
    }
}
