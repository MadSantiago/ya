package p000;

/* JADX INFO: renamed from: ۦًؙؖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C3556 extends EnumC3840 {
    public C3556() {
        super("TagOpen", 7);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        char cM6965 = c3884.m6965();
        if (cM6965 == '!') {
            c4271.m7568(EnumC3840.f12826);
            return;
        }
        if (cM6965 == '/') {
            c4271.m7568(EnumC3840.f12847);
            return;
        }
        if (cM6965 == '?') {
            c4271.m7568(EnumC3840.f12809);
            return;
        }
        if (c3884.m6970()) {
            c4271.m7569(true);
            c4271.f14137 = EnumC3840.f12808;
        } else {
            c4271.m7571(this);
            c4271.m7565('<');
            c4271.f14137 = EnumC3840.f12856;
        }
    }
}
