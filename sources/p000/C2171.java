package p000;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: ۥۘؕۥَ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2171 implements InterfaceC0999 {

    /* JADX INFO: renamed from: ۦۨ */
    public final C1862 f7169;

    public C2171(C1862 c1862) {
        this.f7169 = c1862;
    }

    @Override // p000.InterfaceC0999
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo2179() {
        return new C1109(this.f7169.m3709(null), null, null);
    }

    @Override // p000.InterfaceC0999
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo2180(Object obj, C0781 c0781) throws IOException {
        c0781.write(C0971.f3428.m2034(C1109.Companion.serializer(), (C1109) obj).getBytes(AbstractC4637.f15306));
    }

    @Override // p000.InterfaceC0999
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo2181(FileInputStream fileInputStream) throws C1042 {
        try {
            C0971 c0971 = C0971.f3428;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, fileInputStream.available()));
            AbstractC3831.m6845(fileInputStream, byteArrayOutputStream);
            String str = new String(byteArrayOutputStream.toByteArray(), AbstractC4637.f15306);
            c0971.getClass();
            return (C1109) c0971.m2035(C1109.Companion.serializer(), str);
        } catch (Exception e) {
            throw new C1042("Cannot parse session data", e);
        }
    }
}
