package p000;

import android.graphics.Bitmap;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦؔؔؔۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3220 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Date f10809;

    /* JADX INFO: renamed from: ۥُ */
    public final Date f10810;

    /* JADX INFO: renamed from: ۥّ */
    public final String f10811;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2248 f10812;

    /* JADX INFO: renamed from: ۥۜ */
    public final long f10813;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2813 f10814;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f10815;

    /* JADX INFO: renamed from: ۦِ */
    public final String f10816;

    /* JADX INFO: renamed from: ۦٛ */
    public final long f10817;

    /* JADX INFO: renamed from: ۦۗ */
    public final int f10818;

    /* JADX INFO: renamed from: ۦۙ */
    public final Date f10819;

    /* JADX WARN: Code duplicated, block: B:12:0x0042 A[EDGE_INSN: B:12:0x0042->B:35:0x009f BREAK  A[LOOP:1: B:19:0x0066->B:30:0x0096]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00be A[EDGE_INSN: B:43:0x00be->B:66:0x0118 BREAK  A[LOOP:2: B:50:0x00e3->B:61:0x0111]] */
    public C3220(C2813 c2813, C2248 c2248) {
        int i;
        int i2;
        Date date;
        Date date2;
        Date date3;
        DateFormat simpleDateFormat;
        this.f10814 = c2813;
        this.f10812 = c2248;
        this.f10818 = -1;
        if (c2248 != null) {
            this.f10813 = c2248.f7459;
            this.f10817 = c2248.f7464;
            C4714 c4714 = c2248.f7461;
            int size = c4714.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                String strM8049 = c4714.m8049(i4);
                if (AbstractC4981.m8360(strM8049, "Date")) {
                    String strM8048 = c4714.m8048("Date");
                    if (strM8048 == null) {
                        date3 = null;
                        break;
                    }
                    C2452 c2452 = AbstractC3181.f10688;
                    if (strM8048.length() == 0) {
                        date3 = null;
                        break;
                    }
                    ParsePosition parsePosition = new ParsePosition(i3);
                    Date date4 = ((DateFormat) AbstractC3181.f10688.get()).parse(strM8048, parsePosition);
                    if (parsePosition.getIndex() == strM8048.length()) {
                        date3 = date4;
                    } else {
                        String[] strArr = AbstractC3181.f10687;
                        synchronized (strArr) {
                            try {
                                int length = strArr.length;
                                int i5 = i3;
                                while (true) {
                                    if (i5 >= length) {
                                        date3 = null;
                                        break;
                                    }
                                    DateFormat[] dateFormatArr = AbstractC3181.f10686;
                                    DateFormat dateFormat = dateFormatArr[i5];
                                    if (dateFormat == null) {
                                        simpleDateFormat = new SimpleDateFormat(AbstractC3181.f10687[i5], Locale.US);
                                        simpleDateFormat.setTimeZone(AbstractC4031.f13448);
                                        dateFormatArr[i5] = simpleDateFormat;
                                        i3 = 0;
                                    } else {
                                        simpleDateFormat = dateFormat;
                                    }
                                    parsePosition.setIndex(i3);
                                    Date date5 = simpleDateFormat.parse(strM8048, parsePosition);
                                    if (parsePosition.getIndex() != 0) {
                                        date3 = date5;
                                        break;
                                    } else {
                                        i5++;
                                        i3 = 0;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    this.f10809 = date3;
                    this.f10815 = c4714.m8047(i4);
                } else {
                    if (AbstractC4981.m8360(strM8049, "Expires")) {
                        String strM80410 = c4714.m8048("Expires");
                        if (strM80410 == null) {
                            date2 = null;
                            break;
                        }
                        C2452 c2453 = AbstractC3181.f10688;
                        if (strM80410.length() == 0) {
                            date2 = null;
                            break;
                        }
                        ParsePosition parsePosition2 = new ParsePosition(0);
                        Date date6 = ((DateFormat) AbstractC3181.f10688.get()).parse(strM80410, parsePosition2);
                        if (parsePosition2.getIndex() == strM80410.length()) {
                            date2 = date6;
                        } else {
                            String[] strArr2 = AbstractC3181.f10687;
                            synchronized (strArr2) {
                                try {
                                    int length2 = strArr2.length;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= length2) {
                                            date2 = null;
                                            break;
                                        }
                                        DateFormat[] dateFormatArr2 = AbstractC3181.f10686;
                                        DateFormat simpleDateFormat2 = dateFormatArr2[i6];
                                        if (simpleDateFormat2 == null) {
                                            simpleDateFormat2 = new SimpleDateFormat(AbstractC3181.f10687[i6], Locale.US);
                                            simpleDateFormat2.setTimeZone(AbstractC4031.f13448);
                                            dateFormatArr2[i6] = simpleDateFormat2;
                                        }
                                        parsePosition2.setIndex(0);
                                        Date date7 = simpleDateFormat2.parse(strM80410, parsePosition2);
                                        if (parsePosition2.getIndex() != 0) {
                                            date2 = date7;
                                            break;
                                        }
                                        i6++;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        this.f10819 = date2;
                    } else if (AbstractC4981.m8360(strM8049, "Last-Modified")) {
                        String strM80411 = c4714.m8048("Last-Modified");
                        if (strM80411 != null) {
                            C2452 c2454 = AbstractC3181.f10688;
                            if (strM80411.length() == 0) {
                                date = null;
                            } else {
                                ParsePosition parsePosition3 = new ParsePosition(0);
                                Date date8 = ((DateFormat) AbstractC3181.f10688.get()).parse(strM80411, parsePosition3);
                                if (parsePosition3.getIndex() == strM80411.length()) {
                                    date = date8;
                                } else {
                                    String[] strArr3 = AbstractC3181.f10687;
                                    synchronized (strArr3) {
                                        try {
                                            int length3 = strArr3.length;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 >= length3) {
                                                    i = 0;
                                                } else {
                                                    DateFormat[] dateFormatArr3 = AbstractC3181.f10686;
                                                    DateFormat simpleDateFormat3 = dateFormatArr3[i7];
                                                    if (simpleDateFormat3 == null) {
                                                        simpleDateFormat3 = new SimpleDateFormat(AbstractC3181.f10687[i7], Locale.US);
                                                        simpleDateFormat3.setTimeZone(AbstractC4031.f13448);
                                                        dateFormatArr3[i7] = simpleDateFormat3;
                                                    }
                                                    i = 0;
                                                    parsePosition3.setIndex(0);
                                                    Date date9 = simpleDateFormat3.parse(strM80411, parsePosition3);
                                                    if (parsePosition3.getIndex() != 0) {
                                                        date = date9;
                                                        break;
                                                    }
                                                    i7++;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                this.f10810 = date;
                                this.f10811 = c4714.m8047(i4);
                            }
                            i = 0;
                            this.f10810 = date;
                            this.f10811 = c4714.m8047(i4);
                        } else {
                            i = 0;
                        }
                        date = null;
                        this.f10810 = date;
                        this.f10811 = c4714.m8047(i4);
                    } else {
                        i = 0;
                        if (AbstractC4981.m8360(strM8049, "ETag")) {
                            this.f10816 = c4714.m8047(i4);
                        } else if (AbstractC4981.m8360(strM8049, "Age")) {
                            String strM8047 = c4714.m8047(i4);
                            Bitmap.Config config = AbstractC0080.f15150;
                            Long lM8361 = AbstractC4981.m8361(strM8047);
                            if (lM8361 != null) {
                                long jLongValue = lM8361.longValue();
                                i2 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                            } else {
                                i2 = -1;
                            }
                            this.f10818 = i2;
                        }
                    }
                    i4++;
                    i3 = i;
                }
                i = 0;
                i4++;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    /* JADX INFO: renamed from: ۥۣ */
    public final C4219 m5911() {
        String string;
        long time;
        int i;
        C2813 c2813 = this.f10814;
        C4714 c4714 = (C4714) c2813.f9390;
        C0774 c0774 = (C0774) c2813.f9393;
        C2248 c2248 = this.f10812;
        if (c2248 == null) {
            return new C4219(c2813, null);
        }
        InterfaceC5130 interfaceC5130 = c2248.f7463;
        if (c0774.f2802 && !c2248.f7460) {
            return new C4219(c2813, null);
        }
        C1035 c1035 = (C1035) interfaceC5130.getValue();
        if (c2813.m5374().f3659 || ((C1035) interfaceC5130.getValue()).f3659 || AbstractC3831.m6874(c2248.f7461.m8048("Vary"), "*")) {
            return new C4219(c2813, null);
        }
        C1035 c1035M5374 = c2813.m5374();
        if (!c1035M5374.f3661) {
            String str = "If-Modified-Since";
            if (c4714.m8048("If-Modified-Since") == null && c4714.m8048("If-None-Match") == null) {
                long time2 = this.f10817;
                Date date = this.f10809;
                long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i2 = this.f10818;
                if (i2 != -1) {
                    jMax = Math.max(jMax, timeUnit.toMillis(i2));
                }
                long time3 = this.f10813;
                long jLongValue = jMax + (time2 - time3) + (((Number) AbstractC3618.f12059.mo449()).longValue() - time2);
                int i3 = ((C1035) interfaceC5130.getValue()).f3656;
                Date date2 = this.f10810;
                if (i3 != -1) {
                    time = timeUnit.toMillis(i3);
                } else {
                    Date date3 = this.f10819;
                    if (date3 != null) {
                        if (date != null) {
                            time2 = date.getTime();
                        }
                        time = date3.getTime() - time2;
                        if (time <= 0) {
                            time = 0;
                        }
                    } else if (date2 == null) {
                        time = 0;
                    } else {
                        List list = c0774.f2804;
                        if (list == null) {
                            string = null;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            C3223.m5939(list, sb);
                            string = sb.toString();
                        }
                        if (string != null) {
                            time = 0;
                        } else {
                            if (date != null) {
                                time3 = date.getTime();
                            }
                            long time4 = time3 - date2.getTime();
                            if (time4 > 0) {
                                time = time4 / 10;
                            } else {
                                time = 0;
                            }
                        }
                    }
                }
                int i4 = c1035M5374.f3656;
                if (i4 != -1) {
                    time = Math.min(time, timeUnit.toMillis(i4));
                }
                int i5 = c1035M5374.f3666;
                long millis = i5 != -1 ? timeUnit.toMillis(i5) : 0L;
                long millis2 = (c1035.f3668 || (i = c1035M5374.f3660) == -1) ? 0L : timeUnit.toMillis(i);
                if (!c1035.f3661 && jLongValue + millis < time + millis2) {
                    return new C4219(null, c2248);
                }
                String str2 = this.f10816;
                if (str2 != null) {
                    str = "If-None-Match";
                } else if (date2 != null) {
                    str2 = this.f10811;
                } else {
                    if (date == null) {
                        return new C4219(c2813, null);
                    }
                    str2 = this.f10815;
                }
                C1414 c1414M5377 = c2813.m5377();
                ((C5086) c1414M5377.f4869).m8691(str, str2);
                return new C4219(c1414M5377.m2998(), c2248);
            }
        }
        return new C4219(c2813, null);
    }
}
