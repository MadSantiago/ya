package p000;

/* JADX INFO: renamed from: ۥٍِؒٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C0937 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3635 f3330;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5837 f3331;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3969 f3332;

    public C0937(C3969 c3969, C5837 c5837, C3635 c3635) {
        this.f3332 = c3969;
        this.f3331 = c5837;
        this.f3330 = c3635;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0937) {
            C0937 c0937 = (C0937) obj;
            return AbstractC3831.m6874(this.f3332, c0937.f3332) && this.f3331 == c0937.f3331 && this.f3330 == c0937.f3330;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3330.hashCode() + ((this.f3331.hashCode() + (this.f3332.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f3332 + ", legacyTextFieldState=" + this.f3331 + ", textFieldSelectionManager=" + this.f3330 + ')';
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C4306 c4306 = (C4306) abstractC5381;
        if (c4306.f17786) {
            c4306.f14242.mo3444();
            c4306.f14242.m7126(c4306);
        }
        C3969 c3969 = this.f3332;
        c4306.f14242 = c3969;
        if (c4306.f17786) {
            if (c3969.f13271 != null) {
                AbstractC4690.m8035("Expected textInputModifierNode to be null");
            }
            c3969.f13271 = c4306;
        }
        c4306.f14245 = this.f3331;
        c4306.f14243 = this.f3330;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C4306(this.f3332, this.f3331, this.f3330);
    }
}
