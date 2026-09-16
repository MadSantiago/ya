package p000;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۦٌٌؖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3735 implements InterfaceC0550 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C3286 f12441;

    public C3735(C3286 c3286) {
        this.f12441 = c3286;
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۥؗ */
    public final long mo728() {
        return this.f12441.m6046();
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۥُ */
    public final String mo729() {
        BinderC0902 binderC0902 = new BinderC0902();
        C3286 c3286 = this.f12441;
        c3286.m6045(new C1285(c3286, binderC0902, 3, false));
        return (String) BinderC0902.m1886(binderC0902.m1887(500L), String.class);
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۥّ */
    public final String mo730() {
        BinderC0902 binderC0902 = new BinderC0902();
        C3286 c3286 = this.f12441;
        c3286.m6045(new C1285(c3286, binderC0902, 4, false));
        return (String) BinderC0902.m1886(binderC0902.m1887(500L), String.class);
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo731(String str, String str2, Bundle bundle) {
        C3286 c3286 = this.f12441;
        c3286.m6045(new C4786(c3286, str, str2, bundle, 1));
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo732(Bundle bundle) {
        C3286 c3286 = this.f12441;
        c3286.m6045(new C1976(c3286, bundle, 0));
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo733(String str, String str2, Bundle bundle) {
        C3286 c3286 = this.f12441;
        c3286.m6045(new C4786(c3286, str, str2, bundle, 0));
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦؚ */
    public final String mo734() {
        BinderC0902 binderC0902 = new BinderC0902();
        C3286 c3286 = this.f12441;
        c3286.m6045(new C1285(c3286, binderC0902, 0));
        return (String) BinderC0902.m1886(binderC0902.m1887(500L), String.class);
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦٌ */
    public final Map mo735(String str, String str2, boolean z) {
        BinderC0902 binderC0902 = new BinderC0902();
        C3286 c3286 = this.f12441;
        c3286.m6045(new C4713(c3286, str, str2, z, binderC0902));
        Bundle bundleM1887 = binderC0902.m1887(5000L);
        if (bundleM1887 == null || bundleM1887.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleM1887.size());
        for (String str3 : bundleM1887.keySet()) {
            Object obj = bundleM1887.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦِ */
    public final String mo736() {
        BinderC0902 binderC0902 = new BinderC0902();
        C3286 c3286 = this.f12441;
        c3286.m6045(new C1285(c3286, binderC0902, 1));
        return (String) BinderC0902.m1886(binderC0902.m1887(50L), String.class);
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦٛ */
    public final int mo737(String str) {
        BinderC0902 binderC0902 = new BinderC0902();
        C3286 c3286 = this.f12441;
        c3286.m6045(new C1770(c3286, str, binderC0902, 1));
        Integer num = (Integer) BinderC0902.m1886(binderC0902.m1887(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo738(String str) {
        C3286 c3286 = this.f12441;
        c3286.m6045(new C1204(c3286, str, 1));
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦۙ */
    public final List mo739(String str, String str2) {
        BinderC0902 binderC0902 = new BinderC0902();
        C3286 c3286 = this.f12441;
        c3286.m6045(new C3696(c3286, str, str2, binderC0902));
        List list = (List) BinderC0902.m1886(binderC0902.m1887(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo740(String str) {
        C3286 c3286 = this.f12441;
        c3286.m6045(new C1204(c3286, str, 0));
    }
}
