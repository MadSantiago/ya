package p000;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: ۥَؓؗۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0347 implements InterfaceC4976 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f1278;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f1279;

    public /* synthetic */ C0347(int i, Object obj) {
        this.f1279 = i;
        this.f1278 = obj;
    }

    @Override // p000.InterfaceC4976
    public final Object apply(Object obj) {
        int i = this.f1279;
        Object obj2 = this.f1278;
        switch (i) {
            case 0:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((C3001) obj2).f10094)), (Throwable) obj);
                return null;
            default:
                C3882 c3882 = (C3882) obj2;
                C5914 c5914 = (C5914) obj;
                C4898 c4898 = new C4898();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (C3882.f12972) {
                            C4810 c4810 = (C4810) c3882.f12980.get();
                            Uri uri = c3882.f12982;
                            C4898 c4899 = new C4898(c5914.m9741());
                            c4899.f16142 = new C4898[]{c4898};
                            c4810.m8183(uri, c4899);
                            c3882.f12978 = c5914.m9741();
                            break;
                        }
                        synchronized (C3882.f12973) {
                            C4810 c4811 = (C4810) c3882.f12980.get();
                            Uri uri2 = c3882.f12981;
                            C4898 c48910 = new C4898(c5914.m9740());
                            c48910.f16142 = new C4898[]{c4898};
                            c4811.m8183(uri2, c48910);
                            c5914.m9740();
                            break;
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
        }
    }
}
