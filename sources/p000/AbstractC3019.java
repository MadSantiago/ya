package p000;

/* JADX INFO: renamed from: ۦؚؑؑۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3019 extends AbstractC5381 {

    /* JADX INFO: renamed from: ۥً */
    public final int f10166 = AbstractC5490.m9191(this);

    /* JADX INFO: renamed from: ۦٚ */
    public AbstractC5381 f10167;

    /* JADX INFO: renamed from: ۥؑ */
    public final InterfaceC3975 m5603(InterfaceC3975 interfaceC3975) {
        AbstractC5381 abstractC5381 = ((AbstractC5381) interfaceC3975).f17791;
        if (abstractC5381 != interfaceC3975) {
            AbstractC5381 abstractC5382 = interfaceC3975 instanceof AbstractC5381 ? (AbstractC5381) interfaceC3975 : null;
            AbstractC5381 abstractC5383 = abstractC5382 != null ? abstractC5382.f17780 : null;
            if (abstractC5381 != this.f17791 || !AbstractC3831.m6874(abstractC5383, this)) {
                C1078.m2276("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (abstractC5381.f17786) {
                AbstractC3480.m6278("Cannot delegate to an already attached node");
            }
            abstractC5381.mo5612(this.f17791);
            int i = this.f17781;
            int iM9192 = AbstractC5490.m9192(abstractC5381);
            abstractC5381.f17781 = iM9192;
            int i2 = this.f17781;
            int i3 = iM9192 & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof InterfaceC4933)) {
                AbstractC3480.m6278("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC5381);
            }
            abstractC5381.f17783 = this.f10167;
            this.f10167 = abstractC5381;
            abstractC5381.f17780 = this;
            m5604(iM9192 | this.f17781, false);
            if (this.f17786) {
                if (i3 == 0 || (i & 2) != 0) {
                    mo5610(this.f17789);
                } else {
                    C2457 c2457 = AbstractC5537.m9270(this).f2256;
                    this.f17791.mo5610(null);
                    c2457.m4590();
                }
                abstractC5381.mo5608();
                abstractC5381.mo5611();
                if (!abstractC5381.f17786) {
                    AbstractC3480.m6278("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC5490.m9194(abstractC5381, -1, 1);
            }
        }
        return interfaceC3975;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: ۥؒ */
    public final void m5604(int i, boolean z) {
        AbstractC5381 abstractC5381;
        int i2 = this.f17781;
        this.f17781 = i;
        if (i2 != i) {
            AbstractC5381 abstractC5382 = this.f17791;
            if (abstractC5382 == this) {
                this.f17782 = i;
            }
            boolean z2 = this.f17786;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.f17781;
                    r2.f17781 = i;
                    if (r2 == abstractC5382) {
                        break;
                    } else {
                        r2 = r2.f17780;
                    }
                }
                if (z && r2 == abstractC5382) {
                    i = AbstractC5490.m9192(abstractC5382);
                    abstractC5382.f17781 = i;
                }
                int i3 = i | ((r2 == 0 || (abstractC5381 = r2.f17783) == null) ? 0 : abstractC5381.f17782);
                for (?? r3 = r2; r3 != 0; r3 = r3.f17780) {
                    i3 |= r3.f17781;
                    r3.f17782 = i3;
                }
            }
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥؘ */
    public final void mo5605() {
        super.mo5605();
        for (AbstractC5381 abstractC5381 = this.f10167; abstractC5381 != null; abstractC5381 = abstractC5381.f17783) {
            abstractC5381.mo5605();
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥٔ */
    public final void mo5606() {
        super.mo5606();
        for (AbstractC5381 abstractC5381 = this.f10167; abstractC5381 != null; abstractC5381 = abstractC5381.f17783) {
            abstractC5381.mo5606();
        }
    }

    /* JADX INFO: renamed from: ۥٜ */
    public final void m5607(InterfaceC3975 interfaceC3975) {
        AbstractC5381 abstractC5381 = null;
        for (AbstractC5381 abstractC5382 = this.f10167; abstractC5382 != null; abstractC5382 = abstractC5382.f17783) {
            if (abstractC5382 == interfaceC3975) {
                boolean z = abstractC5382.f17786;
                if (z) {
                    C1254 c1254 = AbstractC5490.f18100;
                    if (!z) {
                        AbstractC3480.m6278("autoInvalidateRemovedNode called on unattached node");
                    }
                    AbstractC5490.m9194(abstractC5382, -1, 2);
                    abstractC5382.mo5606();
                    abstractC5382.mo5609();
                }
                abstractC5382.mo5612(abstractC5382);
                abstractC5382.f17782 = 0;
                AbstractC5381 abstractC5383 = abstractC5382.f17783;
                if (abstractC5381 == null) {
                    this.f10167 = abstractC5383;
                } else {
                    abstractC5381.f17783 = abstractC5383;
                }
                abstractC5382.f17783 = null;
                abstractC5382.f17780 = null;
                int i = this.f17781;
                int iM9192 = AbstractC5490.m9192(this);
                m5604(iM9192, true);
                if (this.f17786 && (i & 2) != 0 && (iM9192 & 2) == 0) {
                    C2457 c2457 = AbstractC5537.m9270(this).f2256;
                    this.f17791.mo5610(null);
                    c2457.m4590();
                    return;
                }
                return;
            }
            abstractC5381 = abstractC5382;
        }
        C5028.m8449(interfaceC3975, "Could not find delegate: ");
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٍ */
    public final void mo5608() {
        super.mo5608();
        for (AbstractC5381 abstractC5381 = this.f10167; abstractC5381 != null; abstractC5381 = abstractC5381.f17783) {
            abstractC5381.mo5610(this.f17789);
            if (!abstractC5381.f17786) {
                abstractC5381.mo5608();
            }
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦْ */
    public final void mo5609() {
        for (AbstractC5381 abstractC5381 = this.f10167; abstractC5381 != null; abstractC5381 = abstractC5381.f17783) {
            abstractC5381.mo5609();
        }
        super.mo5609();
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٙ */
    public final void mo5610(AbstractC1311 abstractC1311) {
        this.f17789 = abstractC1311;
        for (AbstractC5381 abstractC5381 = this.f10167; abstractC5381 != null; abstractC5381 = abstractC5381.f17783) {
            abstractC5381.mo5610(abstractC1311);
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٜ */
    public final void mo5611() {
        for (AbstractC5381 abstractC5381 = this.f10167; abstractC5381 != null; abstractC5381 = abstractC5381.f17783) {
            abstractC5381.mo5611();
        }
        super.mo5611();
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦۡ */
    public final void mo5612(AbstractC5381 abstractC5381) {
        this.f17791 = abstractC5381;
        for (AbstractC5381 abstractC5382 = this.f10167; abstractC5382 != null; abstractC5382 = abstractC5382.f17783) {
            abstractC5382.mo5612(abstractC5381);
        }
    }
}
