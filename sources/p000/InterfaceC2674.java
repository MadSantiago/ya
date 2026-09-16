package p000;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: ۥۤؔٛ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2674 extends InterfaceC3832, WritableByteChannel {
    @Override // p000.InterfaceC3832, java.io.Flushable
    void flush();

    InterfaceC2674 write(byte[] bArr);

    InterfaceC2674 writeByte(int i);

    InterfaceC2674 writeInt(int i);

    InterfaceC2674 writeShort(int i);

    /* JADX INFO: renamed from: ۥؔ */
    InterfaceC2674 mo2660(String str);

    /* JADX INFO: renamed from: ۥۦ */
    InterfaceC2674 mo2681(int i, byte[] bArr);

    /* JADX INFO: renamed from: ۦؑ */
    C1270 mo2685();

    /* JADX INFO: renamed from: ۦِ */
    InterfaceC2674 mo2692(long j);

    /* JADX INFO: renamed from: ۦٛ */
    InterfaceC2674 mo2696(C1007 c1007);

    /* JADX INFO: renamed from: ۦۜ */
    InterfaceC2674 mo2699(long j);
}
