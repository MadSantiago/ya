package p000;

/* JADX INFO: renamed from: ۦٌۗؒۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4952 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C4885 f16386;

    public C4952(C4885 c4885) {
        this.f16386 = c4885;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4952) && this.f16386.equals(((C4952) obj).f16386);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f16386.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f16386 + ", overrideDescendants=false)";
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C3588 c3588 = (C3588) abstractC5381;
        C4885 c4885 = c3588.f6136;
        C4885 c4886 = this.f16386;
        if (AbstractC3831.m6874(c4885, c4886)) {
            return;
        }
        c3588.f6136 = c4886;
        if (c3588.f6135) {
            c3588.m3634();
        }
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C3588(this.f16386, null);
    }
}
