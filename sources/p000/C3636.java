package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: ۦًؑؒۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3636 implements InterfaceC4598 {

    /* JADX INFO: renamed from: ۥْ */
    public int f12163;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f12164;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Inflater f12165;

    /* JADX INFO: renamed from: ۦۨ */
    public final C4162 f12166;

    public C3636(C4162 c4162, Inflater inflater) {
        this.f12166 = c4162;
        this.f12165 = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12164) {
            return;
        }
        this.f12165.end();
        this.f12164 = true;
        this.f12166.close();
    }

    @Override // p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public final long mo406(C1270 c1270, long j) throws IOException {
        long j2;
        while (j >= 0) {
            if (this.f12164) {
                C1078.m2276("closed");
                return 0L;
            }
            C4162 c4162 = this.f12166;
            Inflater inflater = this.f12165;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    C3341 c3341M2662 = c1270.m2662(1);
                    int iMin = (int) Math.min(j, 8192 - c3341M2662.f11174);
                    if (inflater.needsInput() && !c4162.m7362()) {
                        C3341 c3341 = c4162.f13856.f4341;
                        int i = c3341.f11174;
                        int i2 = c3341.f11177;
                        int i3 = i - i2;
                        this.f12163 = i3;
                        inflater.setInput(c3341.f11178, i2, i3);
                    }
                    int iInflate = inflater.inflate(c3341M2662.f11178, c3341M2662.f11174, iMin);
                    int i4 = this.f12163;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.f12163 -= remaining;
                        c4162.skip(remaining);
                    }
                    if (iInflate > 0) {
                        c3341M2662.f11174 += iInflate;
                        j2 = iInflate;
                        c1270.f4340 += j2;
                    } else {
                        if (c3341M2662.f11177 == c3341M2662.f11174) {
                            c1270.f4341 = c3341M2662.m6103();
                            AbstractC3701.m6565(c3341M2662);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (c4162.m7362()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        C1078.m2273(AbstractC3761.m6634(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // p000.InterfaceC4598, p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return this.f12166.f13857.mo961();
    }
}
