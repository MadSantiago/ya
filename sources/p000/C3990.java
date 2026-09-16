package p000;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ۦِؗٓ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3990 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final /* synthetic */ InterfaceC0504[] f13316;

    /* JADX INFO: renamed from: ۥؗ */
    public final C5631 f13317;

    /* JADX INFO: renamed from: ۥۗ */
    public final ThreadLocal f13318 = new ThreadLocal();

    /* JADX INFO: renamed from: ۥۣ */
    public final String f13319;

    static {
        C3214 c3214 = new C3214(C5106.f16949, C3990.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        AbstractC5041.f16726.getClass();
        f13316 = new InterfaceC0504[]{c3214};
    }

    public C3990(Context context, String str) {
        C5631 c5631;
        this.f13319 = str;
        final int i = 0;
        C4122 c4122 = new C4122(new InterfaceC4745(this) { // from class: ۦٛؓٛؐ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C3990 f15239;

            {
                this.f15239 = this;
            }

            @Override // p000.InterfaceC4745
            /* JADX INFO: renamed from: ۦؚ */
            public final Object mo211(Object obj) {
                int i2 = i;
                C3990 c3990 = this.f15239;
                switch (i2) {
                    case 0:
                        Log.w(AbstractC5041.m8557(C3990.class).m5775(), "CorruptionException in " + c3990.f13319 + " DataStore running in process " + Process.myPid(), (C1042) obj);
                        return new C1337(true);
                    default:
                        return Collections.singletonList(new C5280((Context) obj, c3990.f13319, AbstractC3802.f12623, new C5558(AbstractC3486.f11585, null, 5), new C3408(3, null)));
                }
            }
        });
        final int i2 = 1;
        InterfaceC4745 interfaceC4745 = new InterfaceC4745(this) { // from class: ۦٛؓٛؐ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C3990 f15239;

            {
                this.f15239 = this;
            }

            @Override // p000.InterfaceC4745
            /* JADX INFO: renamed from: ۦؚ */
            public final Object mo211(Object obj) {
                int i3 = i2;
                C3990 c3990 = this.f15239;
                switch (i3) {
                    case 0:
                        Log.w(AbstractC5041.m8557(C3990.class).m5775(), "CorruptionException in " + c3990.f13319 + " DataStore running in process " + Process.myPid(), (C1042) obj);
                        return new C1337(true);
                    default:
                        return Collections.singletonList(new C5280((Context) obj, c3990.f13319, AbstractC3802.f12623, new C5558(AbstractC3486.f11585, null, 5), new C3408(3, null)));
                }
            }
        };
        C0649 c0649 = AbstractC0912.f3276;
        C3950 c3950M7151 = AbstractC4009.m7151(AbstractC4593.m7963(ExecutorC4540.f15006, AbstractC4554.m7891()));
        C0635 c0635 = new C0635(str, c4122, interfaceC4745, c3950M7151);
        InterfaceC0504 interfaceC0504 = f13316[0];
        C5631 c5632 = c0635.f2368;
        if (c5632 == null) {
            synchronized (c0635.f2369) {
                try {
                    if (c0635.f2368 == null) {
                        Context applicationContext = context.getApplicationContext();
                        List list = (List) interfaceC4745.mo211(applicationContext);
                        int i3 = 19;
                        c0635.f2368 = new C5631(new C5631(new C4482(new C0365(C1298.f4435, new C5285(i3, new C5304(10, applicationContext, c0635))), Collections.singletonList(new C0023(list, null, i3)), c4122, c3950M7151)));
                    }
                    c5631 = c0635.f2368;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c5632 = c5631;
        }
        this.f13317 = c5632;
    }
}
