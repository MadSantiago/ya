package p000;

/* JADX INFO: renamed from: ۦٍؓٞۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3772 implements InterfaceC4137 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4482 f12543;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3772 f12544;

    public C3772(C3772 c3772, C4482 c4482) {
        this.f12544 = c3772;
        this.f12543 = c4482;
    }

    @Override // p000.InterfaceC4137
    public final InterfaceC2218 getKey() {
        return C0373.f1384;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m6675(C4482 c4482) {
        if (this.f12543 == c4482) {
            C1078.m2276("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        C3772 c3772 = this.f12544;
        if (c3772 != null) {
            c3772.m6675(c4482);
        }
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥٖ */
    public final InterfaceC3534 mo860(InterfaceC3534 interfaceC3534) {
        return AbstractC4593.m7963(this, interfaceC3534);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC4137 mo865(InterfaceC2218 interfaceC2218) {
        return AbstractC3801.m6745(this, interfaceC2218);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۧ */
    public final Object mo875(InterfaceC5731 interfaceC5731, Object obj) {
        return interfaceC5731.mo219(obj, this);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۦؙ */
    public final InterfaceC3534 mo881(InterfaceC2218 interfaceC2218) {
        return AbstractC3801.m6798(this, interfaceC2218);
    }
}
