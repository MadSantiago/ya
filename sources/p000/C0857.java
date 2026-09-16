package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥًؖ۠ؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0857 implements InterfaceC5731, InterfaceC2609, InterfaceC3275, InterfaceC4237, InterfaceC2051, InterfaceC3210, InterfaceC2425, InterfaceC0799, InterfaceC3460, InterfaceC3321, InterfaceC1016, InterfaceC4213, InterfaceC0116, InterfaceC4394, InterfaceC5252, InterfaceC5400, InterfaceC1617, InterfaceC4352, InterfaceC4751 {

    /* JADX INFO: renamed from: ۥَ */
    public ArrayList f3163;

    /* JADX INFO: renamed from: ۥْ */
    public Object f3164;

    /* JADX INFO: renamed from: ۥٓ */
    public C5863 f3165;

    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean f3166;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f3167;

    public C0857(int i, Object obj, boolean z) {
        this.f3167 = i;
        this.f3166 = z;
        this.f3164 = obj;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final Object m1815(C0843 c0843, Object obj, Object obj2, C5362 c5362, int i) {
        c5362.m8979(this.f3167);
        m1821(c5362);
        int iM7048 = c5362.m8963(this) ? AbstractC3925.m7048(2, 3) : AbstractC3925.m7048(1, 3);
        Object obj3 = this.f3164;
        AbstractC3801.m6782(5, obj3);
        Object objMo1670 = ((InterfaceC4237) obj3).mo1670(c0843, obj, obj2, c5362, Integer.valueOf(iM7048 | i));
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0089(this, c0843, obj, obj2, i, 3);
        }
        return objMo1670;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final Object m1816(Object obj, C5362 c5362, int i) {
        c5362.m8979(this.f3167);
        m1821(c5362);
        int i2 = 2;
        int iM7048 = c5362.m8963(this) ? AbstractC3925.m7048(2, 1) : AbstractC3925.m7048(1, 1);
        Object obj2 = this.f3164;
        AbstractC3801.m6782(3, obj2);
        Object objMo1173 = ((InterfaceC2609) obj2).mo1173(obj, c5362, Integer.valueOf(iM7048 | i));
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0016(i, i2, this, obj);
        }
        return objMo1173;
    }

    @Override // p000.InterfaceC2425
    /* JADX INFO: renamed from: ۥۗ */
    public final /* bridge */ /* synthetic */ Object mo1817(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, C5362 c5362, Integer num) {
        return m1820(obj, bool, obj2, obj3, obj4, c5362, num.intValue());
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final /* bridge */ /* synthetic */ Object mo219(Object obj, Object obj2) {
        return m1818(((Number) obj2).intValue(), (C5362) obj);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Object m1818(int i, C5362 c5362) {
        c5362.m8979(this.f3167);
        m1821(c5362);
        int iM7048 = i | (c5362.m8963(this) ? AbstractC3925.m7048(2, 0) : AbstractC3925.m7048(1, 0));
        Object obj = this.f3164;
        AbstractC3801.m6782(2, obj);
        Object objMo219 = ((InterfaceC5731) obj).mo219(c5362, Integer.valueOf(iM7048));
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C2283(2, this, C0857.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objMo219;
    }

    @Override // p000.InterfaceC4237
    /* JADX INFO: renamed from: ۦٌ */
    public final /* bridge */ /* synthetic */ Object mo1670(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m1815((C0843) obj, obj2, obj3, (C5362) obj4, ((Number) obj5).intValue());
    }

    /* JADX INFO: renamed from: ۦِ */
    public final Object m1819(Object obj, Object obj2, C5362 c5362, int i) {
        c5362.m8979(this.f3167);
        m1821(c5362);
        int iM7048 = c5362.m8963(this) ? AbstractC3925.m7048(2, 2) : AbstractC3925.m7048(1, 2);
        Object obj3 = this.f3164;
        AbstractC3801.m6782(4, obj3);
        Object objMo1822 = ((InterfaceC3275) obj3).mo1822(obj, obj2, c5362, Integer.valueOf(iM7048 | i));
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0021(i, 4, this, obj, obj2);
        }
        return objMo1822;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final Object m1820(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, C5362 c5362, int i) {
        c5362.m8979(this.f3167);
        m1821(c5362);
        int iM7048 = c5362.m8963(this) ? AbstractC3925.m7048(2, 6) : AbstractC3925.m7048(1, 6);
        Object obj5 = this.f3164;
        AbstractC3801.m6782(8, obj5);
        Object objMo1817 = ((InterfaceC2425) obj5).mo1817(obj, bool, obj2, obj3, obj4, c5362, Integer.valueOf(i | iM7048));
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4460(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objMo1817;
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final /* bridge */ /* synthetic */ Object mo1173(Object obj, Object obj2, Object obj3) {
        return m1816(obj, (C5362) obj2, ((Number) obj3).intValue());
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m1821(C5362 c5362) {
        C5863 c5863M8998;
        if (!this.f3166 || (c5863M8998 = c5362.m8998()) == null) {
            return;
        }
        c5863M8998.f19363 |= 1;
        C5863 c5863 = this.f3165;
        if (c5863 == null || !c5863.m9683() || c5863 == c5863M8998 || AbstractC3831.m6874(c5863.f19360, c5863M8998.f19360)) {
            this.f3165 = c5863M8998;
            return;
        }
        ArrayList arrayList = this.f3163;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f3163 = arrayList2;
            arrayList2.add(c5863M8998);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5863 c5864 = (C5863) arrayList.get(i);
            if (c5864 == null || !c5864.m9683() || c5864 == c5863M8998 || AbstractC3831.m6874(c5864.f19360, c5863M8998.f19360)) {
                arrayList.set(i, c5863M8998);
                return;
            }
        }
        arrayList.add(c5863M8998);
    }

    @Override // p000.InterfaceC3275
    /* JADX INFO: renamed from: ۦ۟ */
    public final /* bridge */ /* synthetic */ Object mo1822(Object obj, Object obj2, Object obj3, Object obj4) {
        return m1819(obj, obj2, (C5362) obj3, ((Number) obj4).intValue());
    }
}
