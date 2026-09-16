package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: ۦٞؖؗ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4809 extends InputStream {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f15854;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15855;

    public C4809(C0348 c0348, AbstractC4650 abstractC4650) {
        this.f15855 = 3;
        this.f15854 = abstractC4650;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        int i = this.f15855;
        Object obj = this.f15854;
        switch (i) {
            case 0:
                return (int) Math.min(((C1270) obj).f4340, 2147483647L);
            case 1:
                C4162 c4162 = (C4162) obj;
                if (!c4162.f13855) {
                    return (int) Math.min(c4162.f13856.f4340, 2147483647L);
                }
                C5028.m8448("closed");
                return 0;
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f15855) {
            case 0:
                break;
            case 1:
                ((C4162) this.f15854).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f15855;
        Object obj = this.f15854;
        switch (i3) {
            case 0:
                return ((C1270) obj).read(bArr, i, i2);
            case 1:
                C4162 c4162 = (C4162) obj;
                C1270 c1270 = c4162.f13856;
                if (c4162.f13855) {
                    C5028.m8448("closed");
                    return 0;
                }
                C5063.m8614(bArr.length, i, i2);
                if (c1270.f4340 == 0 && c4162.f13857.mo406(c1270, 8192L) == -1) {
                    return -1;
                }
                return c1270.read(bArr, i, i2);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Inflater inflater = (Inflater) ((C0348) obj).f1280;
                try {
                    int iInflate = inflater.inflate(bArr, i, i2);
                    if (iInflate > 0) {
                        return iInflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (inflater.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = inflater.getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            default:
                return ((AbstractC4650) obj).mo4600(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.f15855) {
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                if (j <= 0) {
                    return 0L;
                }
                int i = j > 2147483647L ? Integer.MAX_VALUE : (int) j;
                ((AbstractC4650) this.f15854).mo4623(i);
                return i;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        int i = this.f15855;
        Object obj = this.f15854;
        switch (i) {
            case 0:
                return ((C1270) obj) + ".inputStream()";
            case 1:
                return ((C4162) obj) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C4809(Closeable closeable, int i) {
        this.f15855 = i;
        this.f15854 = closeable;
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final void m8181() {
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f15855;
        Object obj = this.f15854;
        switch (i) {
            case 0:
                C1270 c1270 = (C1270) obj;
                if (c1270.f4340 > 0) {
                    return c1270.readByte() & 255;
                }
                return -1;
            case 1:
                C4162 c4162 = (C4162) obj;
                C1270 c1271 = c4162.f13856;
                if (c4162.f13855) {
                    C5028.m8448("closed");
                    return 0;
                }
                if (c1271.f4340 == 0 && c4162.f13857.mo406(c1271, 8192L) == -1) {
                    return -1;
                }
                return c1271.readByte() & 255;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((AbstractC4650) obj).mo4600(bArr2, 0, 1) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }
}
