package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۦؒؖٞ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3127 {
    protected transient int zza;

    /* JADX INFO: renamed from: ۥۗ */
    public abstract int mo5753(InterfaceC0759 interfaceC0759);

    /* JADX INFO: renamed from: ۥۣ */
    public final byte[] m5754() {
        try {
            AbstractC5212 abstractC5212 = (AbstractC5212) this;
            int iM8830 = abstractC5212.m8830();
            byte[] bArr = new byte[iM8830];
            boolean z = AbstractC0438.f1609;
            C4155 c4155 = new C4155(iM8830, bArr);
            abstractC5212.m8827(c4155);
            if (c4155.m7350() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (c4155.m7350() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(AbstractC3761.m6622(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
