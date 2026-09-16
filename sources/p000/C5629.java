package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۦَۣ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5629 extends IOException {

    /* JADX INFO: renamed from: ۦۨ */
    public final int f18557;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5629(int i) {
        String str;
        switch (i) {
            case 1:
                str = "NO_ERROR";
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                str = "PROTOCOL_ERROR";
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                str = "INTERNAL_ERROR";
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                str = "FLOW_CONTROL_ERROR";
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                str = "SETTINGS_TIMEOUT";
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "STREAM_CLOSED";
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "FRAME_SIZE_ERROR";
                break;
            case 8:
                str = "REFUSED_STREAM";
                break;
            case 9:
                str = "CANCEL";
                break;
            case 10:
                str = "COMPRESSION_ERROR";
                break;
            case 11:
                str = "CONNECT_ERROR";
                break;
            case 12:
                str = "ENHANCE_YOUR_CALM";
                break;
            case 13:
                str = "INADEQUATE_SECURITY";
                break;
            case 14:
                str = "HTTP_1_1_REQUIRED";
                break;
            default:
                str = "null";
                break;
        }
        super("stream was reset: ".concat(str));
        this.f18557 = i;
    }
}
