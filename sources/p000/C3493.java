package p000;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: ۦؘؕٞۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3493 extends AbstractC4086 implements InterfaceC5502 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final File f11590;

    /* JADX INFO: renamed from: ۦۨ */
    public final FileOutputStream f11591;

    public C3493(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f11591 = fileOutputStream;
        this.f11590 = file;
    }

    @Override // p000.InterfaceC5502
    /* JADX INFO: renamed from: ۥۣ */
    public final File mo1546() {
        return this.f11590;
    }
}
