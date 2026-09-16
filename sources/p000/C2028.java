package p000;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥٟؗۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2028 extends AbstractC5004 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C5235 f6685;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5371 f6686;

    public C2028(C5371 c5371) {
        AbstractC0487.m1047(c5371);
        this.f6686 = c5371;
        C5235 c5235 = c5371.f17709;
        C5371.m9023(c5235);
        this.f6685 = c5235;
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۥؗ */
    public final long mo728() {
        C1512 c1512 = this.f6686.f17721;
        C5371.m9021(c1512);
        return c1512.m3214();
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۥُ */
    public final String mo729() {
        C5266 c5266 = ((C5371) this.f6685.f18660).f17711;
        C5371.m9023(c5266);
        C0932 c0932 = c5266.f17354;
        if (c0932 != null) {
            return c0932.f3320;
        }
        return null;
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۥّ */
    public final String mo730() {
        C5266 c5266 = ((C5371) this.f6685.f18660).f17711;
        C5371.m9023(c5266);
        C0932 c0932 = c5266.f17354;
        if (c0932 != null) {
            return c0932.f3319;
        }
        return null;
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo731(String str, String str2, Bundle bundle) {
        this.f6685.m8881(str, str2, bundle);
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo732(Bundle bundle) {
        C5235 c5235 = this.f6685;
        ((C5371) c5235.f18660).f17719.getClass();
        c5235.m8882(bundle, System.currentTimeMillis());
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo733(String str, String str2, Bundle bundle) {
        C5235 c5235 = this.f6686.f17709;
        C5371.m9023(c5235);
        c5235.m8867(str, str2, bundle);
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦؚ */
    public final String mo734() {
        return this.f6685.m8872();
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦٌ */
    public final Map mo735(String str, String str2, boolean z) {
        C5235 c5235 = this.f6685;
        C5371 c5371 = (C5371) c5235.f18660;
        C3644 c3644 = c5371.f17733;
        C3610 c3610 = c5371.f17717;
        C5371.m9020(c3644);
        if (c3644.m6519()) {
            C5371.m9020(c3610);
            c3610.f12020.m9432("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (C4452.m7739()) {
            C5371.m9020(c3610);
            c3610.f12020.m9432("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        C3644 c3645 = c5371.f17733;
        C5371.m9020(c3645);
        c3645.m6514(atomicReference, 5000L, "get user properties", new RunnableC0836(c5235, atomicReference, str, str2, z));
        List<C1477> list = (List) atomicReference.get();
        if (list == null) {
            C5371.m9020(c3610);
            c3610.f12020.m9430(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        C4461 c4461 = new C4461(list.size());
        for (C1477 c1477 : list) {
            Object objM3090 = c1477.m3090();
            if (objM3090 != null) {
                c4461.put(c1477.f5025, objM3090);
            }
        }
        return c4461;
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦِ */
    public final String mo736() {
        return (String) this.f6685.f17284.get();
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦٛ */
    public final int mo737(String str) {
        C5235 c5235 = this.f6685;
        c5235.getClass();
        AbstractC0487.m1090(str);
        C0515 c0515 = ((C5371) c5235.f18660).f17715;
        return 25;
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo738(String str) {
        C5371 c5371 = this.f6686;
        C4961 c4961 = c5371.f17725;
        C5371.m9022(c4961);
        c5371.f17719.getClass();
        c4961.m8337(SystemClock.elapsedRealtime(), str);
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦۙ */
    public final List mo739(String str, String str2) {
        C5235 c5235 = this.f6685;
        C5371 c5371 = (C5371) c5235.f18660;
        C3644 c3644 = c5371.f17733;
        C3610 c3610 = c5371.f17717;
        C5371.m9020(c3644);
        if (c3644.m6519()) {
            C5371.m9020(c3610);
            c3610.f12020.m9432("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C4452.m7739()) {
            C5371.m9020(c3610);
            c3610.f12020.m9432("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C3644 c3645 = c5371.f17733;
        C5371.m9020(c3645);
        c3645.m6514(atomicReference, 5000L, "get conditional user properties", new RunnableC1948(c5235, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C1512.m3200(list);
        }
        C5371.m9020(c3610);
        c3610.f12020.m9430(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // p000.InterfaceC0550
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo740(String str) {
        C5371 c5371 = this.f6686;
        C4961 c4961 = c5371.f17725;
        C5371.m9022(c4961);
        c5371.f17719.getClass();
        c4961.m8338(SystemClock.elapsedRealtime(), str);
    }
}
