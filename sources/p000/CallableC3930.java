package p000;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۦٌؘُۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC3930 implements Callable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Bundle f13110;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ BinderC5179 f13111;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5855 f13112;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13113;

    public /* synthetic */ CallableC3930(BinderC5179 binderC5179, C5855 c5855, Bundle bundle, int i) {
        this.f13113 = i;
        this.f13112 = c5855;
        this.f13110 = bundle;
        this.f13111 = binderC5179;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.f13113;
        Bundle bundle = this.f13110;
        C5855 c5855 = this.f13112;
        BinderC5179 binderC5179 = this.f13111;
        switch (i) {
            case 0:
                C5034 c5034 = binderC5179.f17131;
                c5034.m8494();
                return c5034.m8507(bundle, c5855);
            default:
                C5034 c5035 = binderC5179.f17131;
                c5035.m8494();
                return c5035.m8507(bundle, c5855);
        }
    }
}
