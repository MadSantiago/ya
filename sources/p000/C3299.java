package p000;

/* JADX INFO: renamed from: ۦٟؕؗٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C3299 extends EnumC3840 {
    public C3299() {
        super("AfterDoctypeName", 53);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        boolean zM6964 = c3884.m6964();
        C4338 c4338 = EnumC3840.f12856;
        if (zM6964) {
            c4271.m7570(this);
            c4271.m7572();
            c4271.f14137 = c4338;
            return;
        }
        if (c3884.m6968('\t', '\n', '\r', '\f', ' ')) {
            c3884.m6960();
            return;
        }
        if (c3884.m6963('>')) {
            c4271.m7572();
            c4271.m7568(c4338);
        } else if (c3884.m6962("PUBLIC")) {
            c4271.f14137 = EnumC3840.f12853;
        } else if (c3884.m6962("SYSTEM")) {
            c4271.f14137 = EnumC3840.f12838;
        } else {
            c4271.m7571(this);
            c4271.m7568(EnumC3840.f12835);
        }
    }
}
