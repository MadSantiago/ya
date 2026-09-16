package p000;

/* JADX INFO: renamed from: ۥؘۖؒؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2082 implements InterfaceC0252 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5880 f6865;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f6866 = AbstractC3933.m7094();

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC0252 f6867;

    public C2082(C5880 c5880, InterfaceC0252 interfaceC0252) {
        this.f6865 = c5880;
        this.f6867 = interfaceC0252;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f6865.f19411.get()) {
            C4773.m8154(21, "Statement is recycled");
            throw null;
        }
        if (this.f6866 == AbstractC3933.m7094()) {
            this.f6867.close();
        } else {
            C4773.m8154(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p000.InterfaceC0252
    public final byte[] getBlob(int i) {
        if (this.f6865.f19411.get()) {
            C4773.m8154(21, "Statement is recycled");
            throw null;
        }
        if (this.f6866 == AbstractC3933.m7094()) {
            return this.f6867.getBlob(i);
        }
        C4773.m8154(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.InterfaceC0252
    public final int getColumnCount() {
        if (this.f6865.f19411.get()) {
            C4773.m8154(21, "Statement is recycled");
            throw null;
        }
        if (this.f6866 == AbstractC3933.m7094()) {
            return this.f6867.getColumnCount();
        }
        C4773.m8154(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.InterfaceC0252
    public final String getColumnName(int i) {
        if (this.f6865.f19411.get()) {
            C4773.m8154(21, "Statement is recycled");
            throw null;
        }
        if (this.f6866 == AbstractC3933.m7094()) {
            return this.f6867.getColumnName(i);
        }
        C4773.m8154(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.InterfaceC0252
    public final long getLong(int i) {
        if (this.f6865.f19411.get()) {
            C4773.m8154(21, "Statement is recycled");
            throw null;
        }
        if (this.f6866 == AbstractC3933.m7094()) {
            return this.f6867.getLong(i);
        }
        C4773.m8154(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.InterfaceC0252
    public final boolean isNull(int i) {
        if (this.f6865.f19411.get()) {
            C4773.m8154(21, "Statement is recycled");
            throw null;
        }
        if (this.f6866 == AbstractC3933.m7094()) {
            return this.f6867.isNull(i);
        }
        C4773.m8154(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.InterfaceC0252
    public final void reset() {
        if (this.f6865.f19411.get()) {
            C4773.m8154(21, "Statement is recycled");
            throw null;
        }
        if (this.f6866 == AbstractC3933.m7094()) {
            this.f6867.reset();
        } else {
            C4773.m8154(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۥؓ */
    public final void mo530(int i, String str) {
        if (this.f6865.f19411.get()) {
            C4773.m8154(21, "Statement is recycled");
            throw null;
        }
        if (this.f6866 == AbstractC3933.m7094()) {
            this.f6867.mo530(i, str);
        } else {
            C4773.m8154(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo531(int i) {
        if (this.f6865.f19411.get()) {
            C4773.m8154(21, "Statement is recycled");
            throw null;
        }
        if (this.f6866 == AbstractC3933.m7094()) {
            this.f6867.mo531(i);
        } else {
            C4773.m8154(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۥُ */
    public final void mo532(long j, int i) {
        if (this.f6865.f19411.get()) {
            C4773.m8154(21, "Statement is recycled");
            throw null;
        }
        if (this.f6866 == AbstractC3933.m7094()) {
            this.f6867.mo532(j, i);
        } else {
            C4773.m8154(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۦؗ */
    public final boolean mo533() {
        if (this.f6865.f19411.get()) {
            C4773.m8154(21, "Statement is recycled");
            throw null;
        }
        if (this.f6866 == AbstractC3933.m7094()) {
            return this.f6867.mo533();
        }
        C4773.m8154(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۦۗ */
    public final String mo534(int i) {
        if (this.f6865.f19411.get()) {
            C4773.m8154(21, "Statement is recycled");
            throw null;
        }
        if (this.f6866 == AbstractC3933.m7094()) {
            return this.f6867.mo534(i);
        }
        C4773.m8154(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo535(int i, byte[] bArr) {
        if (this.f6865.f19411.get()) {
            C4773.m8154(21, "Statement is recycled");
            throw null;
        }
        if (this.f6866 == AbstractC3933.m7094()) {
            this.f6867.mo535(i, bArr);
        } else {
            C4773.m8154(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
