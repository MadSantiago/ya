package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.WindowInsetsAnimation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥّٕۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2346 implements InterfaceC5611, InterfaceC4988, InterfaceC4895, InterfaceC2856, InterfaceC3814, InterfaceC3596, InterfaceC2659, InterfaceC2429, InterfaceC1170, InterfaceC3077 {

    /* JADX INFO: renamed from: ۥْ */
    public Object f7785;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f7786;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7787;

    public C2346(int i) {
        this.f7787 = i;
        switch (i) {
            case 13:
                this.f7786 = new C3223(29);
                this.f7785 = new C2094(16);
                break;
            case 15:
                this.f7786 = new C0863(new Reference[16]);
                this.f7785 = new ReferenceQueue();
                break;
            case 20:
                this.f7786 = Collections.synchronizedMap(new WeakHashMap());
                this.f7785 = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 22:
                this.f7786 = new HashMap();
                this.f7785 = new C0387(6);
                C0387 c0387 = new C0387(0);
                EnumC3130 enumC3130 = EnumC3130.f10491;
                ArrayList arrayList = c0387.f1445;
                arrayList.add(enumC3130);
                arrayList.add(EnumC3130.f10526);
                arrayList.add(EnumC3130.f10532);
                arrayList.add(EnumC3130.f10499);
                arrayList.add(EnumC3130.f10524);
                arrayList.add(EnumC3130.f10494);
                arrayList.add(EnumC3130.f10480);
                m4407(c0387);
                C0387 c0388 = new C0387(1);
                EnumC3130 enumC3131 = EnumC3130.f10521;
                ArrayList arrayList2 = c0388.f1445;
                arrayList2.add(enumC3131);
                arrayList2.add(EnumC3130.f10505);
                arrayList2.add(EnumC3130.f10540);
                arrayList2.add(EnumC3130.f10508);
                arrayList2.add(EnumC3130.f10511);
                arrayList2.add(EnumC3130.f10487);
                arrayList2.add(EnumC3130.f10500);
                arrayList2.add(EnumC3130.f10529);
                m4407(c0388);
                C0387 c0389 = new C0387(2);
                EnumC3130 enumC3132 = EnumC3130.f10489;
                ArrayList arrayList3 = c0389.f1445;
                arrayList3.add(enumC3132);
                arrayList3.add(EnumC3130.f10477);
                arrayList3.add(EnumC3130.f10510);
                arrayList3.add(EnumC3130.f10483);
                arrayList3.add(EnumC3130.f10517);
                arrayList3.add(EnumC3130.f10490);
                arrayList3.add(EnumC3130.f10509);
                arrayList3.add(EnumC3130.f10478);
                arrayList3.add(EnumC3130.f10535);
                arrayList3.add(EnumC3130.f10485);
                arrayList3.add(EnumC3130.f10520);
                arrayList3.add(EnumC3130.f10502);
                arrayList3.add(EnumC3130.f10492);
                m4407(c0389);
                C0387 c03810 = new C0387(3);
                EnumC3130 enumC3133 = EnumC3130.f10488;
                ArrayList arrayList4 = c03810.f1445;
                arrayList4.add(enumC3133);
                arrayList4.add(EnumC3130.f10528);
                arrayList4.add(EnumC3130.f10530);
                m4407(c03810);
                C0387 c03811 = new C0387(4);
                EnumC3130 enumC3134 = EnumC3130.f10533;
                ArrayList arrayList5 = c03811.f1445;
                arrayList5.add(enumC3134);
                arrayList5.add(EnumC3130.f10537);
                arrayList5.add(EnumC3130.f10493);
                arrayList5.add(EnumC3130.f10496);
                arrayList5.add(EnumC3130.f10507);
                arrayList5.add(EnumC3130.f10514);
                arrayList5.add(EnumC3130.f10497);
                arrayList5.add(EnumC3130.f10504);
                m4407(c03811);
                C0387 c03812 = new C0387(5);
                EnumC3130 enumC3135 = EnumC3130.f10534;
                ArrayList arrayList6 = c03812.f1445;
                arrayList6.add(enumC3135);
                arrayList6.add(EnumC3130.f10518);
                arrayList6.add(EnumC3130.f10516);
                arrayList6.add(EnumC3130.f10506);
                arrayList6.add(EnumC3130.f10512);
                arrayList6.add(EnumC3130.f10479);
                arrayList6.add(EnumC3130.f10515);
                arrayList6.add(EnumC3130.f10495);
                arrayList6.add(EnumC3130.f10538);
                arrayList6.add(EnumC3130.f10484);
                m4407(c03812);
                C0387 c03813 = new C0387(7);
                EnumC3130 enumC3136 = EnumC3130.f10486;
                ArrayList arrayList7 = c03813.f1445;
                arrayList7.add(enumC3136);
                arrayList7.add(EnumC3130.f10527);
                arrayList7.add(EnumC3130.f10501);
                arrayList7.add(EnumC3130.f10519);
                arrayList7.add(EnumC3130.f10525);
                arrayList7.add(EnumC3130.f10503);
                arrayList7.add(EnumC3130.f10482);
                arrayList7.add(EnumC3130.f10481);
                arrayList7.add(EnumC3130.f10498);
                arrayList7.add(EnumC3130.f10536);
                arrayList7.add(EnumC3130.f10523);
                arrayList7.add(EnumC3130.f10539);
                arrayList7.add(EnumC3130.f10513);
                m4407(c03813);
                break;
            default:
                this.f7786 = new LinkedHashMap();
                this.f7785 = new LinkedHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static C4744 m4394(C0834 c0834, Throwable th) {
        if (th instanceof C5496) {
            c0834.getClass();
            C3294 c3294 = c0834.f2958;
            c3294.getClass();
            C3294 c3295 = AbstractC0040.f7816;
            c3294.getClass();
        } else {
            c0834.f2958.getClass();
            C3294 c3296 = AbstractC0040.f7816;
        }
        return new C4744(null, c0834, th);
    }

    @Override // p000.InterfaceC1170
    public void accept(Object obj, Object obj2) {
        int i = C1543.f5220;
        BinderC0222 binderC0222 = new BinderC0222((C2332) obj2);
        C3663 c3663 = (C3663) ((C5390) obj).m7333();
        String[] strArr = (String[]) this.f7785;
        String str = (String) this.f7786;
        Parcel parcelM7504 = c3663.m7504();
        AbstractC5564.m9344(parcelM7504, binderC0222);
        parcelM7504.writeString(str);
        parcelM7504.writeInt(0);
        parcelM7504.writeStringArray(strArr);
        parcelM7504.writeByteArray(null);
        c3663.m7505(parcelM7504, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.InterfaceC4895
    public Object get() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i = 3;
        int i2 = 4;
        switch (this.f7787) {
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C4575 c4575 = new C4575(i2);
                C4369 c4369 = new C4369(i);
                Object obj = ((InterfaceC4895) this.f7786).get();
                return new C1835(c4575, c4369, C1276.f4349, (C0668) obj, (InterfaceC4895) this.f7785);
            case 28:
                C5460 c5460 = (C5460) this.f7786;
                String str = (String) this.f7785;
                int i3 = AbstractC3307.f11071;
                int i4 = C5243.f17312;
                C4340 c4340M7634 = new C4340().m7634(str.getBytes());
                ByteBuffer byteBuffer = c4340M7634.f14324;
                byteBuffer.put((byte) 0);
                char c = '\b';
                if (byteBuffer.remaining() < 8) {
                    c4340M7634.m7636();
                }
                C4340 c4340M7635 = c4340M7634.m7634("".getBytes());
                c4340M7635.m7636();
                ByteBuffer byteBuffer2 = c4340M7635.f14324;
                byteBuffer2.flip();
                if (byteBuffer2.remaining() > 0) {
                    c4340M7635.f14325 = byteBuffer2.remaining() + c4340M7635.f14325;
                    char c2 = 24;
                    long j8 = 0;
                    switch (byteBuffer2.remaining()) {
                        case 1:
                            j = 0;
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            c = '\b';
                            j2 = 0;
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            c = '\b';
                            j3 = 0;
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            c = '\b';
                            c2 = 24;
                            j4 = 0;
                            j3 = (((long) (byteBuffer2.get(3) & 255)) << c2) ^ j4;
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            c = '\b';
                            j5 = 0;
                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                            j3 = (((long) (byteBuffer2.get(3) & 255)) << c2) ^ j4;
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            j6 = 0;
                            j5 = j6 ^ (((long) (byteBuffer2.get(5) & 255)) << 40);
                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                            j3 = (((long) (byteBuffer2.get(3) & 255)) << c2) ^ j4;
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            j6 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                            j5 = j6 ^ (((long) (byteBuffer2.get(5) & 255)) << 40);
                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                            j3 = (((long) (byteBuffer2.get(3) & 255)) << c2) ^ j4;
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 8:
                            j7 = byteBuffer2.getLong();
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 9:
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 10:
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 11:
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 12:
                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 13:
                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 14:
                            j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 15:
                            j8 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                            j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            c4340M7635.f14323 = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c4340M7635.f14323;
                            c4340M7635.f14322 ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        default:
                            throw new AssertionError("Should never get here.");
                    }
                }
                long j9 = c4340M7635.f14323;
                long j10 = c4340M7635.f14325;
                long j11 = j9 ^ j10;
                long j12 = j10 ^ c4340M7635.f14322;
                long j13 = j11 + j12;
                long j14 = j12 + j13;
                long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                long j19 = j18 ^ (j18 >>> 33);
                long j20 = (j16 ^ (j16 >>> 33)) + j19;
                c4340M7635.f14323 = j20;
                c4340M7635.f14322 = j19 + j20;
                byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(c4340M7635.f14323).putLong(c4340M7635.f14322).array();
                bArrArray.getClass();
                return ((C5839) c5460.f18001).m5107((byte[]) bArrArray.clone());
            default:
                return ((C5839) ((C5460) this.f7786).f18001).m5107(((AbstractC4314) this.f7785).m7608());
        }
    }

    public String toString() {
        switch (this.f7787) {
            case 16:
                return "Bounds{lower=" + ((C5364) this.f7786) + " upper=" + ((C5364) this.f7785) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۥؓ */
    public void m4395(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f7786)) {
            map = new HashMap((Map) this.f7786);
        }
        synchronized (((Map) this.f7785)) {
            map2 = new HashMap((Map) this.f7785);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                C0178.m382();
                return;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C2332) entry2.getKey()).m4375(new C1717(status));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c  */
    /* JADX INFO: renamed from: ۥؖ */
    public C1765 m4396(C1765 c1765) {
        boolean z;
        boolean z2;
        Bitmap.Config config = c1765.f5879;
        int i = c1765.f5890;
        boolean z3 = true;
        if (config != Bitmap.Config.HARDWARE || ((InterfaceC1411) this.f7785).mo2978()) {
            z = false;
        } else {
            config = Bitmap.Config.ARGB_8888;
            z = true;
        }
        Bitmap.Config config2 = config;
        if (AbstractC3761.m6619(c1765.f5890)) {
            ComponentCallbacks2C2386 componentCallbacks2C2386 = (ComponentCallbacks2C2386) this.f7786;
            synchronized (componentCallbacks2C2386) {
                componentCallbacks2C2386.m4463();
                z2 = componentCallbacks2C2386.f7912;
            }
            if (z2) {
                z3 = z;
            } else {
                i = 4;
            }
        } else {
            z3 = z;
        }
        return z3 ? new C1765(c1765.f5881, config2, c1765.f5876, c1765.f5882, c1765.f5877, c1765.f5878, c1765.f5888, c1765.f5880, c1765.f5886, c1765.f5885, c1765.f5887, c1765.f5883, c1765.f5884, c1765.f5889, i) : c1765;
    }

    @Override // p000.InterfaceC2856
    /* JADX INFO: renamed from: ۥؗ */
    public Object mo3466(Object obj) {
        return ((InterfaceC4745) this.f7785).mo211(obj);
    }

    /* JADX INFO: renamed from: ۥً */
    public InterfaceC2150 m4397(C1489 c1489, InterfaceC2150 interfaceC2150) {
        AbstractC1605.m3333(c1489);
        if (!(interfaceC2150 instanceof C4837)) {
            return interfaceC2150;
        }
        C4837 c4837 = (C4837) interfaceC2150;
        ArrayList arrayList = c4837.f15930;
        String str = c4837.f15931;
        HashMap map = (HashMap) this.f7786;
        return (map.containsKey(str) ? (C0387) map.get(str) : (C0387) this.f7785).m900(str, c1489, arrayList);
    }

    /* JADX INFO: renamed from: ۥَ */
    public void m4398(Bundle bundle) {
        C5140 c5140 = (C5140) this.f7786;
        InterfaceC3983 interfaceC3983 = c5140.f17027;
        if (!c5140.f17023) {
            c5140.m8749();
        }
        if (interfaceC3983.mo110().mo2387().m976(EnumC0458.f1654)) {
            C5028.m8445(interfaceC3983.mo110().mo2387(), "performRestore cannot be called when owner is ");
            return;
        }
        if (c5140.f17029) {
            C1078.m2276("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleM7092 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleM7092 = AbstractC3933.m7092("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        c5140.f17024 = bundleM7092;
        c5140.f17029 = true;
    }

    @Override // p000.InterfaceC2659
    /* JADX INFO: renamed from: ۥُ */
    public void mo3987(C3580 c3580) {
        ((Map) ((C2346) this.f7785).f7785).remove((C2332) this.f7786);
    }

    @Override // p000.InterfaceC2429
    /* JADX INFO: renamed from: ۥّ */
    public Object mo396(C3580 c3580) {
        boolean z = c3580.m6387() instanceof C2984;
        C5437 c5437 = (C5437) this.f7785;
        C1543 c1543 = (C1543) this.f7786;
        if (z) {
            return c1543.m3293(c5437.m9112());
        }
        if (c3580.m6387() instanceof C1717) {
            C1717 c1717 = (C1717) c3580.m6387();
            c1717.getClass();
            if (c1717.f5720.f301 == 29514) {
                return c1543.m3293(c5437.m9112());
            }
        }
        return c3580;
    }

    /* JADX INFO: renamed from: ۥْ */
    public void m4399(Throwable th) {
        C5235 c5235 = (C5235) this.f7785;
        c5235.mo6517();
        C5371 c5371 = (C5371) c5235.f18660;
        boolean z = false;
        c5235.f17276 = false;
        c5235.m8885().add((C4012) this.f7786);
        int i = 1;
        if (c5235.f17283 > ((Integer) AbstractC4936.f16326.m4592(null)).intValue()) {
            c5235.f17283 = 1;
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9434(C3610.m6440(c5371.m9029().m3854()), C3610.m6440(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        C3610 c3611 = c5371.f17717;
        C5371.m9020(c3611);
        c3611.f12022.m9431("registerTriggerAsync failed. App ID, delay in seconds, throwable", C3610.m6440(c5371.m9029().m3854()), C3610.m6440(String.valueOf(c5235.f17283)), C3610.m6440(th.toString()));
        int i2 = c5235.f17283;
        C0826 c0826 = c5235.f17275;
        if (c0826 == null) {
            c0826 = new C0826(c5235, c5371, i, z);
            c5235.f17275 = c0826;
        }
        c0826.m2199(((long) i2) * 1000);
        int i3 = c5235.f17283;
        c5235.f17283 = i3 + i3;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public C1765 m4400(C0834 c0834, C0181 c0181) {
        c0834.getClass();
        Bitmap.Config config = c0834.f2964;
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        if (config == config2 && ((config == config2 && !c0834.f2962) || !((InterfaceC1411) this.f7785).mo2977(c0181))) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap.Config config3 = config;
        AbstractC3831 abstractC3831 = c0181.f670;
        C4905 c4905 = C4905.f16198;
        return new C1765(c0834.f2963, config3, null, c0181, (abstractC3831.equals(c4905) || c0181.f669.equals(c4905)) ? 2 : c0834.f2960, AbstractC0040.m4430(c0834), c0834.f2969 && config3 != Bitmap.Config.ALPHA_8, true, null, c0834.f2956, c0834.f2971, c0834.f2974, c0834.f2959, c0834.f2968, c0834.f2973);
    }

    @Override // p000.InterfaceC3596
    /* JADX INFO: renamed from: ۥٕ */
    public int mo4401(int i) {
        CharSequence charSequence = (CharSequence) this.f7786;
        do {
            i = ((C0835) this.f7785).m1739(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public void m4402(Bundle bundle) {
        C5140 c5140 = (C5140) this.f7786;
        Bundle bundleM7904 = AbstractC4554.m7904((C3869[]) Arrays.copyOf(new C3869[0], 0));
        Bundle bundle2 = c5140.f17024;
        if (bundle2 != null) {
            bundleM7904.putAll(bundle2);
        }
        synchronized (c5140.f17022) {
            for (Map.Entry entry : c5140.f17028.entrySet()) {
                bundleM7904.putBundle((String) entry.getKey(), ((InterfaceC2895) entry.getValue()).mo5438());
            }
        }
        if (bundleM7904.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM7904);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public C2666 m4403(C1860 c1860) {
        C2666 c2666M5665;
        synchronized (this.f7785) {
            c2666M5665 = ((C3066) this.f7786).m5665(c1860);
        }
        return c2666M5665;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public void m4404() {
        if (!((C5140) this.f7786).f17026) {
            C1078.m2276("Can not perform this action after onSaveInstanceState");
            return;
        }
        C2913 c2913 = (C2913) this.f7785;
        if (c2913 == null) {
            c2913 = new C2913(this);
        }
        this.f7785 = c2913;
        try {
            C3818.class.getDeclaredConstructor(null);
            C2913 c2914 = (C2913) this.f7785;
            if (c2914 != null) {
                ((LinkedHashSet) c2914.f9707).add(C3818.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C3818.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    @Override // p000.InterfaceC4988
    /* JADX INFO: renamed from: ۥۗ */
    public void mo4405(C5772 c5772, Bitmap bitmap, Map map) {
        int i;
        int iM1052 = AbstractC0487.m1052(bitmap);
        C5089 c5089 = (C5089) this.f7785;
        synchronized (c5089.f6888) {
            i = c5089.f6892;
        }
        C5089 c50810 = (C5089) this.f7785;
        if (iM1052 <= i) {
            c50810.m4041(c5772, new C3926(bitmap, map, iM1052));
        } else {
            c50810.m4036(c5772);
            ((C0322) this.f7786).m693(c5772, bitmap, map, iM1052);
        }
    }

    @Override // p000.InterfaceC4988
    /* JADX INFO: renamed from: ۥۜ */
    public void mo4406(int i) {
        int i2;
        if (i >= 40) {
            ((C5089) this.f7785).m4039(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        C5089 c5089 = (C5089) this.f7785;
        synchronized (c5089.f6888) {
            i2 = c5089.f6893;
        }
        c5089.m4039(i2 / 2);
    }

    @Override // p000.InterfaceC5611
    /* JADX INFO: renamed from: ۥۣ */
    public void mo908(C5270 c5270, int i) throws IOException {
        int[] iArr = (int[]) this.f7785;
        try {
            c5270.read((byte[]) this.f7786, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            c5270.close();
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public void m4407(C0387 c0387) {
        Iterator it = c0387.f1445.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f7786).put(Integer.valueOf(((EnumC3130) it.next()).f10541).toString(), c0387);
        }
    }

    @Override // p000.InterfaceC2856
    /* JADX INFO: renamed from: ۦؑ */
    public Object mo3467(C5869 c5869, Object obj) {
        return ((InterfaceC5731) this.f7786).mo219(c5869, obj);
    }

    @Override // p000.InterfaceC3596
    /* JADX INFO: renamed from: ۦؖ */
    public int mo4408(int i) {
        do {
            i = ((C0835) this.f7785).m1737(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f7786).charAt(i - 1)));
        return i;
    }

    @Override // p000.InterfaceC3814
    /* JADX INFO: renamed from: ۦؚ */
    public C3580 mo4409(Object obj) throws Throwable {
        FileWriter fileWriter;
        C5534 c5534 = (C5534) this.f7785;
        JSONObject jSONObject = (JSONObject) ((ExecutorC2291) ((C2808) this.f7786).f9377).f7614.submit(new CallableC4849(2, this)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            C5040 c5040M5744 = ((C3121) c5534.f18260).m5744(jSONObject);
            C5086 c5086 = (C5086) c5534.f18266;
            long j = c5040M5744.f16720;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                try {
                    jSONObject.put("expires_at", j);
                    try {
                        fileWriter = new FileWriter((File) c5086.f16877);
                        try {
                            try {
                                fileWriter.write(jSONObject.toString());
                                fileWriter.flush();
                            } catch (Throwable th) {
                                th = th;
                                fileWriter2 = fileWriter;
                                AbstractC2133.m4138(fileWriter2, "Failed to close settings writer.");
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileWriter = null;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        AbstractC2133.m4138(fileWriter, "Failed to close settings writer.");
                        C5534.m9208(jSONObject, "Loaded settings: ");
                        String str = ((C4408) c5534.f18263).f14510;
                        SharedPreferences.Editor editorEdit = ((Context) c5534.f18265).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        editorEdit.putString("existing_instance_identifier", str);
                        editorEdit.apply();
                        ((AtomicReference) c5534.f18267).set(c5040M5744);
                        ((C2332) ((AtomicReference) c5534.f18264).get()).m4374(c5040M5744);
                        return AbstractC5378.m9075(null);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                AbstractC2133.m4138(fileWriter, "Failed to close settings writer.");
                C5534.m9208(jSONObject, "Loaded settings: ");
                String str2 = ((C4408) c5534.f18263).f14510;
                SharedPreferences.Editor editorEdit2 = ((Context) c5534.f18265).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                editorEdit2.putString("existing_instance_identifier", str2);
                editorEdit2.apply();
                ((AtomicReference) c5534.f18267).set(c5040M5744);
                ((C2332) ((AtomicReference) c5534.f18264).get()).m4374(c5040M5744);
            } catch (Throwable th2) {
                th = th2;
                AbstractC2133.m4138(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
        return AbstractC5378.m9075(null);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public boolean m4410(C1860 c1860) {
        boolean zContainsKey;
        synchronized (this.f7785) {
            zContainsKey = ((C3066) this.f7786).f10306.containsKey(c1860);
        }
        return zContainsKey;
    }

    @Override // p000.InterfaceC3596
    /* JADX INFO: renamed from: ۦِ */
    public int mo4411(int i) {
        do {
            i = ((C0835) this.f7785).m1739(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f7786).charAt(i - 1)));
        return i;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public void m4412(C2666 c2666, int i) {
        C1489 c1489 = (C1489) this.f7785;
        ((ExecutorC2205) c1489.f5059).execute(new RunnableC1589((C3654) this.f7786, c2666, false, i));
    }

    /* JADX INFO: renamed from: ۦٗ */
    public void m4413(String str, InterfaceC2895 interfaceC2895) {
        C5140 c5140 = (C5140) this.f7786;
        synchronized (c5140.f17022) {
            if (c5140.f17028.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            c5140.f17028.put(str, interfaceC2895);
        }
    }

    @Override // p000.InterfaceC3596
    /* JADX INFO: renamed from: ۦٛ */
    public int mo4414(int i) {
        do {
            i = ((C0835) this.f7785).m1737(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f7786).charAt(i)));
        return i;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public Bundle m4415(String str) {
        C5140 c5140 = (C5140) this.f7786;
        if (!c5140.f17029) {
            C1078.m2276("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = c5140.f17024;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM7092 = bundle.containsKey(str) ? AbstractC3933.m7092(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            c5140.f17024 = null;
        }
        return bundleM7092;
    }

    @Override // p000.InterfaceC4988
    /* JADX INFO: renamed from: ۦۙ */
    public C2431 mo4416(C5772 c5772) {
        C3926 c3926 = (C3926) ((C5089) this.f7785).m4035(c5772);
        if (c3926 != null) {
            return new C2431(c3926.f13107, c3926.f13106);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public C2666 m4417(C1860 c1860) {
        C2666 c2666M5663;
        synchronized (this.f7785) {
            c2666M5663 = ((C3066) this.f7786).m5663(c1860);
        }
        return c2666M5663;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public String m4418(String str) {
        String str2 = (String) this.f7785;
        Resources resources = (Resources) this.f7786;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public InterfaceC2895 m4419(String str) {
        InterfaceC2895 interfaceC2895;
        C5140 c5140 = (C5140) this.f7786;
        synchronized (c5140.f17022) {
            Iterator it = c5140.f17028.entrySet().iterator();
            do {
                interfaceC2895 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                InterfaceC2895 interfaceC2896 = (InterfaceC2895) entry.getValue();
                if (AbstractC3831.m6874(str2, str)) {
                    interfaceC2895 = interfaceC2896;
                }
            } while (interfaceC2895 == null);
        }
        return interfaceC2895;
    }

    public /* synthetic */ C2346(int i, Object obj, Object obj2, boolean z) {
        this.f7787 = i;
        this.f7785 = obj;
        this.f7786 = obj2;
    }

    public C2346(Context context) {
        this.f7787 = 10;
        AbstractC0487.m1047(context);
        Resources resources = context.getResources();
        this.f7786 = resources;
        this.f7785 = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public C2346(AppMeasurementSdk appMeasurementSdk, C5002 c5002) {
        this.f7787 = 23;
        this.f7785 = c5002;
        appMeasurementSdk.m119(new C2057(0, this));
        this.f7786 = new HashSet();
    }

    public C2346(C1199 c1199, ComponentCallbacks2C2386 componentCallbacks2C2386) {
        Object c3223;
        this.f7787 = 2;
        this.f7786 = componentCallbacks2C2386;
        if (AbstractC0053.f10147) {
            c3223 = new C2942(false);
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i != 26 && i != 27) {
                c3223 = new C2942(true);
            } else {
                c3223 = new C3223(15);
            }
        }
        this.f7785 = c3223;
    }

    public C2346(C5140 c5140, int i) {
        this.f7787 = i;
        switch (i) {
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f7786 = c5140;
                this.f7785 = new C2346(c5140, 5);
                break;
            default:
                this.f7786 = c5140;
                break;
        }
    }

    public C2346(C2139 c2139) {
        this.f7787 = 12;
        this.f7785 = c2139;
        this.f7786 = new RunnableC3365(10, this);
    }

    public C2346(int i, C0322 c0322) {
        this.f7787 = 1;
        this.f7786 = c0322;
        this.f7785 = new C5089(i, this);
    }

    public C2346(C3066 c3066) {
        this.f7787 = 11;
        this.f7786 = c3066;
        this.f7785 = new Object();
    }

    public /* synthetic */ C2346(int i, Object obj, Object obj2) {
        this.f7787 = i;
        this.f7786 = obj;
        this.f7785 = obj2;
    }

    public C2346(WindowInsetsAnimation.Bounds bounds) {
        this.f7787 = 16;
        this.f7786 = C5364.m9017(bounds.getLowerBound());
        this.f7785 = C5364.m9017(bounds.getUpperBound());
    }
}
