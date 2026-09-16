package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۥٕؖۦۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1419 extends AbstractC2474 {

    /* JADX INFO: renamed from: ۥَ */
    public HashSet f4883;

    /* JADX INFO: renamed from: ۥٓ */
    public String f4884;

    /* JADX INFO: renamed from: ۥٖ */
    public C4461 f4885;

    /* JADX INFO: renamed from: ۦٗ */
    public Long f4886;

    /* JADX INFO: renamed from: ۦۛ */
    public Long f4887;

    /* JADX WARN: Code duplicated, block: B:102:0x023a A[LOOP:20: B:85:0x01ec->B:102:0x023a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x026a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0274  */
    /* JADX WARN: Code duplicated, block: B:123:0x027f  */
    /* JADX WARN: Code duplicated, block: B:125:0x028a  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b8 A[Catch: all -> 0x02d3, SQLiteException -> 0x02d5, LOOP:11: B:131:0x02b8->B:568:?, LOOP_START, TryCatch #4 {SQLiteException -> 0x02d5, blocks: (B:129:0x02b2, B:131:0x02b8, B:133:0x02c9, B:139:0x02d7, B:142:0x02ec), top: B:478:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02c9 A[Catch: all -> 0x02d3, SQLiteException -> 0x02d5, TryCatch #4 {SQLiteException -> 0x02d5, blocks: (B:129:0x02b2, B:131:0x02b8, B:133:0x02c9, B:139:0x02d7, B:142:0x02ec), top: B:478:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02ec A[Catch: all -> 0x02d3, SQLiteException -> 0x02d5, TRY_ENTER, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02d5, blocks: (B:129:0x02b2, B:131:0x02b8, B:133:0x02c9, B:139:0x02d7, B:142:0x02ec), top: B:478:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0329  */
    /* JADX WARN: Code duplicated, block: B:162:0x0337  */
    /* JADX WARN: Code duplicated, block: B:164:0x034e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0449  */
    /* JADX WARN: Code duplicated, block: B:194:0x045a  */
    /* JADX WARN: Code duplicated, block: B:196:0x047a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0491  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:207:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:211:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:217:0x04db  */
    /* JADX WARN: Code duplicated, block: B:223:0x0511  */
    /* JADX WARN: Code duplicated, block: B:226:0x051a  */
    /* JADX WARN: Code duplicated, block: B:228:0x0526  */
    /* JADX WARN: Code duplicated, block: B:230:0x0546  */
    /* JADX WARN: Code duplicated, block: B:231:0x054a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0563 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0582  */
    /* JADX WARN: Code duplicated, block: B:249:0x059e  */
    /* JADX WARN: Code duplicated, block: B:252:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:255:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:262:0x0605  */
    /* JADX WARN: Code duplicated, block: B:265:0x0619  */
    /* JADX WARN: Code duplicated, block: B:271:0x064c  */
    /* JADX WARN: Code duplicated, block: B:275:0x068d  */
    /* JADX WARN: Code duplicated, block: B:282:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:288:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:299:0x06ef A[LOOP:3: B:276:0x068f->B:299:0x06ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:315:0x0720  */
    /* JADX WARN: Code duplicated, block: B:320:0x072b  */
    /* JADX WARN: Code duplicated, block: B:322:0x072f  */
    /* JADX WARN: Code duplicated, block: B:326:0x0741  */
    /* JADX WARN: Code duplicated, block: B:332:0x076e  */
    /* JADX WARN: Code duplicated, block: B:334:0x0799  */
    /* JADX WARN: Code duplicated, block: B:336:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:339:0x07b1 A[LOOP:5: B:330:0x0768->B:339:0x07b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:343:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:346:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:349:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:352:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:354:0x0802  */
    /* JADX WARN: Code duplicated, block: B:358:0x083d  */
    /* JADX WARN: Code duplicated, block: B:365:0x0865  */
    /* JADX WARN: Code duplicated, block: B:371:0x0876  */
    /* JADX WARN: Code duplicated, block: B:382:0x08a3 A[LOOP:7: B:359:0x083f->B:382:0x08a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:400:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:404:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:406:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:410:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:414:0x091d  */
    /* JADX WARN: Code duplicated, block: B:417:0x092e  */
    /* JADX WARN: Code duplicated, block: B:419:0x0943  */
    /* JADX WARN: Code duplicated, block: B:421:0x094f  */
    /* JADX WARN: Code duplicated, block: B:423:0x095a  */
    /* JADX WARN: Code duplicated, block: B:425:0x0981  */
    /* JADX WARN: Code duplicated, block: B:428:0x098b  */
    /* JADX WARN: Code duplicated, block: B:441:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:442:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a0c A[PHI: r21 r22
  0x0a0c: PHI (r21v20 java.util.Map) = (r21v21 java.util.Map), (r0v78 java.util.Map) binds: [B:445:0x0a0a, B:443:0x09fc] A[DONT_GENERATE, DONT_INLINE]
  0x0a0c: PHI (r22v6 ۥؚٕؖۜ) = (r22v7 ۥؚٕؖۜ), (r2v41 ۥؚٕؖۜ) binds: [B:445:0x0a0a, B:443:0x09fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:464:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:467:0x0abd  */
    /* JADX WARN: Code duplicated, block: B:536:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x063e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x06ea A[EDGE_INSN: B:542:0x06ea->B:298:0x06ea BREAK  A[LOOP:3: B:276:0x068f->B:299:0x06ef], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x075d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x0753 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x07be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x07c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x089e A[EDGE_INSN: B:553:0x089e->B:381:0x089e BREAK  A[LOOP:7: B:359:0x083f->B:382:0x08a3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x090e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a11 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a06 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x09e0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0a8f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0a2d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x049d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x048b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x04e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x04d5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x05c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0354 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x0236 A[EDGE_INSN: B:604:0x0236->B:101:0x0236 BREAK  A[LOOP:20: B:85:0x01ec->B:102:0x023a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0188  */
    /* JADX WARN: Code duplicated, block: B:67:0x018f  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cb A[Catch: all -> 0x01d7, SQLiteException -> 0x01da, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x01da, blocks: (B:72:0x01c5, B:74:0x01cb, B:83:0x01e5), top: B:472:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5 A[Catch: all -> 0x01d7, SQLiteException -> 0x01da, TRY_ENTER, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x01da, blocks: (B:72:0x01c5, B:74:0x01cb, B:83:0x01e5), top: B:472:0x01c5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v204 */
    /* JADX WARN: Type inference failed for: r0v205 */
    /* JADX WARN: Type inference failed for: r0v31, types: [ۥؚٕؖۜ] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v19, types: [ۥؚٕؖۜ] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [ۦّٕ۠ؑ] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24, types: [ۦّٕ۠ؑ] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v20, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v31 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r38v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r38v10 */
    /* JADX WARN: Type inference failed for: r38v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r38v13 */
    /* JADX WARN: Type inference failed for: r38v14 */
    /* JADX WARN: Type inference failed for: r38v15 */
    /* JADX WARN: Type inference failed for: r38v16, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r38v17 */
    /* JADX WARN: Type inference failed for: r38v18 */
    /* JADX WARN: Type inference failed for: r38v19 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v20 */
    /* JADX WARN: Type inference failed for: r38v21 */
    /* JADX WARN: Type inference failed for: r38v22 */
    /* JADX WARN: Type inference failed for: r38v23 */
    /* JADX WARN: Type inference failed for: r38v24 */
    /* JADX WARN: Type inference failed for: r38v25 */
    /* JADX WARN: Type inference failed for: r38v26 */
    /* JADX WARN: Type inference failed for: r38v27 */
    /* JADX WARN: Type inference failed for: r38v28 */
    /* JADX WARN: Type inference failed for: r38v29 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r38v30 */
    /* JADX WARN: Type inference failed for: r38v31 */
    /* JADX WARN: Type inference failed for: r38v32 */
    /* JADX WARN: Type inference failed for: r38v33 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r38v8 */
    /* JADX WARN: Type inference failed for: r38v9 */
    /* JADX WARN: Type inference failed for: r3v56, types: [ۦُۣؓؖ] */
    /* JADX WARN: Type inference failed for: r3v70, types: [ۦُۣؓؖ] */
    /* JADX WARN: Type inference failed for: r4v31, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v70, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v71, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v76, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: ۦٗ */
    public final ArrayList m3020(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        boolean z2;
        boolean z3;
        String str2;
        Map map;
        Object obj;
        ?? r5;
        Cursor cursorQuery;
        ?? r17;
        String str3;
        Object obj2;
        ?? r21;
        Map map2;
        String str4;
        boolean z4;
        Map map3;
        Map map4;
        Map map5;
        ?? r10;
        C5034 c5034;
        String str5;
        C3906 c3906;
        BitSet bitSet;
        BitSet bitSet2;
        C4461 c4461;
        C3906 c3907;
        C4461 c4462;
        boolean z5;
        List<C3542> list3;
        long jLongValue;
        Integer numValueOf;
        int i;
        boolean z6;
        Iterator it;
        C3415 c3415;
        Long lValueOf;
        C1159 c1159M8517;
        String str6;
        ?? c4463;
        ?? r7;
        Cursor cursorRawQuery;
        ?? r0;
        C4461 c4464;
        Iterator it2;
        Integer num;
        C3906 c3908;
        List list4;
        ?? r18;
        Iterator it3;
        boolean z7;
        Integer numValueOf2;
        List arrayList;
        String str7;
        ArrayList arrayList2;
        C1159 c1159M8518;
        C5371 c5371;
        String str8;
        ContentValues contentValues;
        Iterator it4;
        C0796 c0796;
        String strM6206;
        Map map6;
        Iterator it5;
        C0796 c0797;
        int iIntValue;
        Iterator it6;
        boolean zM7679;
        C0796 c0798;
        C4630 c4630;
        Integer numValueOf3;
        C4379 c4379;
        int i2;
        Integer numValueOf4;
        C5371 c5372;
        String str9;
        C4461 c4465;
        Cursor cursor;
        C5371 c5373;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        C0615 c0615;
        ?? c4466;
        C5580 c5580M1379;
        C3047 c3047M2447;
        long j;
        String strM9415;
        Map map7;
        int iIntValue2;
        Iterator it7;
        boolean zM7680;
        Map map8;
        C0615 c0616;
        Integer num2;
        C4379 c43710;
        int iM6332;
        C1323 c1323;
        boolean z8;
        String str10;
        C4461 c4467;
        ?? r8;
        String str11;
        ?? r2;
        ?? r38;
        ?? r39;
        ?? Query;
        ?? r310;
        ?? r311;
        ?? r312;
        ?? r313;
        Integer numValueOf6;
        List list6;
        ?? r314;
        List arrayList4;
        C4461 c4468;
        int i3;
        ?? r6;
        Object obj3;
        ?? r9;
        ?? r19;
        ?? r110;
        List arrayList5;
        C5371 c5374 = (C5371) this.f18660;
        AbstractC0487.m1090(str);
        AbstractC0487.m1047(list);
        AbstractC0487.m1047(list2);
        this.f4884 = str;
        this.f4883 = new HashSet();
        this.f4885 = new C4461();
        this.f4886 = l;
        this.f4887 = l2;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((C5580) it8.next()).m9415())) {
                z2 = true;
                break;
            }
        }
        C3642.m6513();
        boolean zM1162 = c5374.f17715.m1162(this.f4884, AbstractC4936.f16255);
        C3642.m6513();
        boolean zM1163 = c5374.f17715.m1162(this.f4884, AbstractC4936.f16324);
        C5034 c5035 = this.f19371;
        if (z2) {
            C1159 c1159M8519 = c5035.m8517();
            String str12 = this.f4884;
            c1159M8519.m4637();
            c1159M8519.mo6517();
            AbstractC0487.m1090(str12);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                c1159M8519.m2463().update("events", contentValues2, "app_id = ?", new String[]{str12});
            } catch (SQLiteException e) {
                ((C5371) c1159M8519.f18660).mo2404().f12020.m9434(C3610.m6440(str12), e, "Error resetting session-scoped event counts. appId");
            }
        }
        Map map9 = Collections.EMPTY_MAP;
        String str13 = "Failed to merge filter. appId";
        Object objM6440 = "Database error querying filters. appId";
        String str14 = "audience_id";
        try {
            try {
                try {
                    if (zM1163 && zM1162) {
                        C1159 c1159M85110 = c5035.m8517();
                        C5371 c5375 = (C5371) c1159M85110.f18660;
                        String str15 = this.f4884;
                        AbstractC0487.m1090(str15);
                        z3 = z2;
                        C4461 c4469 = new C4461();
                        try {
                            ?? Query2 = c1159M85110.m2463().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str15}, null, null, null);
                            try {
                                try {
                                    if (Query2.moveToFirst()) {
                                        str2 = "data";
                                        Query2 = Query2;
                                        ?? r111 = "event_filters";
                                        while (true) {
                                            try {
                                                try {
                                                    C3542 c3542 = (C3542) ((C2227) C3117.m5718(C3542.m6328(), Query2.getBlob(1))).m1977();
                                                    if (c3542.m6340()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query2.getInt(0));
                                                        List list7 = (List) c4469.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            c4469.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(c3542);
                                                        r111 = Query2;
                                                    } else {
                                                        r111 = Query2;
                                                    }
                                                } catch (IOException e2) {
                                                    r111 = Query2;
                                                    c5375.mo2404().f12020.m9434(C3610.m6440(str15), e2, "Failed to merge filter. appId");
                                                }
                                                try {
                                                    if (!r111.moveToNext()) {
                                                        break;
                                                    }
                                                    Query2 = r111;
                                                    r111 = r111;
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    r110 = r111;
                                                    r9 = r110;
                                                    try {
                                                        c5375.mo2404().f12020.m9434(C3610.m6440(str15), e, "Database error querying filters. appId");
                                                        map9 = Collections.EMPTY_MAP;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        map = map9;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r19 = r111;
                                                    r9 = r19;
                                                    if (r9 != 0) {
                                                        r9.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                r110 = Query2;
                                                r9 = r110;
                                                c5375.mo2404().f12020.m9434(C3610.m6440(str15), e, "Database error querying filters. appId");
                                                map9 = Collections.EMPTY_MAP;
                                                if (r9 != 0) {
                                                    r9.close();
                                                }
                                                map = map9;
                                                C1159 c1159M85111 = c5035.m8517();
                                                obj = (C5371) c1159M85111.f18660;
                                                r5 = this.f4884;
                                                c1159M85111.m4637();
                                                c1159M85111.mo6517();
                                                AbstractC0487.m1090(r5);
                                                cursorQuery = c1159M85111.m2463().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    c4468 = new C4461();
                                                    r17 = obj;
                                                    r21 = r5;
                                                    while (true) {
                                                        try {
                                                            i3 = cursorQuery.getInt(0);
                                                            try {
                                                                C3906 c3909 = (C3906) ((C3418) C3117.m5718(C3906.m6979(), cursorQuery.getBlob(1))).m1977();
                                                                Object objValueOf = Integer.valueOf(i3);
                                                                c4468.put(objValueOf, c3909);
                                                                str3 = str13;
                                                                obj2 = objM6440;
                                                                obj3 = objValueOf;
                                                                r6 = r21;
                                                            } catch (IOException e5) {
                                                                C5590 c5590 = r17.mo2404().f12020;
                                                                str3 = str13;
                                                                str13 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objM6440;
                                                                try {
                                                                    objM6440 = C3610.m6440(r21);
                                                                    Integer numValueOf8 = Integer.valueOf(i3);
                                                                    c5590.m9431("Failed to merge filter results. appId, audienceId, error", objM6440, numValueOf8, e5);
                                                                    obj3 = c5590;
                                                                    r6 = numValueOf8;
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    r21 = r21;
                                                                    r17.mo2404().f12020.m9434(C3610.m6440(r21), e, "Database error querying filter results. appId");
                                                                    Map map10 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map10;
                                                                    if (map2.isEmpty()) {
                                                                        r10 = obj2;
                                                                        c5034 = c5035;
                                                                        str5 = "audience_id";
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z3) {
                                                                            String str16 = this.f4884;
                                                                            c1159M8517 = c5035.m8517();
                                                                            str6 = this.f4884;
                                                                            c1159M8517.m4637();
                                                                            c1159M8517.mo6517();
                                                                            AbstractC0487.m1090(str6);
                                                                            c4463 = new C4461();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = c1159M8517.m2463().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) c4463.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    c4463.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            c4463 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e7) {
                                                                                        e = e7;
                                                                                        ((C5371) c1159M8517.f18660).mo2404().f12020.m9434(C3610.m6440(str6), e, "Database error querying scoped filters. appId");
                                                                                        c4463 = Collections.EMPTY_MAP;
                                                                                        r0 = c4463;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        AbstractC0487.m1090(str16);
                                                                                        c4464 = new C4461();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                c3908 = (C3906) map2.get(num);
                                                                                                list4 = (List) r0.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r18 = r0;
                                                                                                it3 = it2;
                                                                                                z7 = zM1162;
                                                                                                c4464.put(num, c3908);
                                                                                                r0 = r18;
                                                                                                str14 = str14;
                                                                                                it2 = it3;
                                                                                                zM1162 = z7;
                                                                                            }
                                                                                        }
                                                                                        str4 = str14;
                                                                                        z4 = zM1162;
                                                                                        map3 = c4464;
                                                                                        map5 = map2;
                                                                                        map4 = map3;
                                                                                        for (Integer num3 : hashSet) {
                                                                                            num3.getClass();
                                                                                            c3906 = (C3906) map4.get(num3);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            c4461 = new C4461();
                                                                                            if (c3906 != null) {
                                                                                                for (C3574 c3574 : c3906.m6995()) {
                                                                                                    if (c3574.m6378()) {
                                                                                                        C3906 c39010 = c3906;
                                                                                                        Integer numValueOf9 = Integer.valueOf(c3574.m6377());
                                                                                                        if (c3574.m6379()) {
                                                                                                            lValueOf = Long.valueOf(c3574.m6382());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        c4461.put(numValueOf9, lValueOf);
                                                                                                        c3906 = c39010;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            c3907 = c3906;
                                                                                            c4462 = new C4461();
                                                                                            if (c3907 != null) {
                                                                                                it = c3907.m6992().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    c3415 = (C3415) it.next();
                                                                                                    if (!c3415.m6187()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map11 = map4;
                                                                                            if (c3907 != null) {
                                                                                                i = 0;
                                                                                                while (i < c3907.m6981() * 64) {
                                                                                                    if (C3117.m5701((InterfaceC1269) c3907.m6982(), i)) {
                                                                                                        z6 = zM1163;
                                                                                                        c5374.mo2404().f12023.m9434(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                                        bitSet2.set(i);
                                                                                                        if (C3117.m5701((InterfaceC1269) c3907.m6984(), i)) {
                                                                                                            bitSet.set(i);
                                                                                                        }
                                                                                                        i++;
                                                                                                        zM1163 = z6;
                                                                                                    } else {
                                                                                                        z6 = zM1163;
                                                                                                    }
                                                                                                    c4461.remove(Integer.valueOf(i));
                                                                                                    i++;
                                                                                                    zM1163 = z6;
                                                                                                }
                                                                                            }
                                                                                            z5 = zM1163;
                                                                                            C3906 c39011 = (C3906) map5.get(num3);
                                                                                            if (z5) {
                                                                                                for (C3542 c3543 : list3) {
                                                                                                    int iM6333 = c3543.m6332();
                                                                                                    Integer num4 = num3;
                                                                                                    jLongValue = this.f4887.longValue() / 1000;
                                                                                                    if (c3543.m6329()) {
                                                                                                        jLongValue = this.f4886.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iM6333);
                                                                                                    if (c4461.containsKey(numValueOf)) {
                                                                                                        c4461.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (c4462.containsKey(numValueOf)) {
                                                                                                        c4462.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num3 = num4;
                                                                                                }
                                                                                            }
                                                                                            this.f4885.put(num3, new C1323(this, this.f4884, c39011, bitSet, bitSet2, c4461, c4462));
                                                                                            c5035 = c5035;
                                                                                            zM1163 = z5;
                                                                                            map5 = map5;
                                                                                            obj2 = obj2;
                                                                                            map = map;
                                                                                            str3 = str3;
                                                                                            map4 = map11;
                                                                                        }
                                                                                        r10 = obj2;
                                                                                        c5034 = c5035;
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str17 = str3;
                                                                                        if (!list.isEmpty()) {
                                                                                            c0615 = new C0615(this);
                                                                                            c4466 = new C4461();
                                                                                            for (C5580 c5580 : list) {
                                                                                                c5580M1379 = c0615.m1379(this.f4884, c5580);
                                                                                                if (c5580M1379 != null) {
                                                                                                    c3047M2447 = c5034.m8517().m2447(this.f4884, c5580, c5580M1379.m9415());
                                                                                                    c5034.m8517().m2443("events", c3047M2447);
                                                                                                    if (z) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        j = c3047M2447.f10241;
                                                                                                        strM9415 = c5580M1379.m9415();
                                                                                                        map7 = (Map) c4466.get(strM9415);
                                                                                                        if (map7 == null) {
                                                                                                            C1159 c1159M85112 = c5034.m8517();
                                                                                                            C5371 c5376 = (C5371) c1159M85112.f18660;
                                                                                                            str10 = this.f4884;
                                                                                                            c1159M85112.m4637();
                                                                                                            c1159M85112.mo6517();
                                                                                                            AbstractC0487.m1090(str10);
                                                                                                            AbstractC0487.m1090(strM9415);
                                                                                                            c4467 = new C4461();
                                                                                                            try {
                                                                                                                Query = c1159M85112.m2463().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strM9415}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (Query.moveToFirst()) {
                                                                                                                            str11 = str10;
                                                                                                                            Query = Query;
                                                                                                                            r312 = list;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        C3542 c3544 = (C3542) ((C2227) C3117.m5718(C3542.m6328(), Query.getBlob(1))).m1977();
                                                                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                                                        list6 = (List) c4467.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            r312 = Query;
                                                                                                                                            try {
                                                                                                                                                arrayList4 = new ArrayList();
                                                                                                                                                c4467.put(numValueOf6, arrayList4);
                                                                                                                                                r314 = r312;
                                                                                                                                            } catch (SQLiteException e8) {
                                                                                                                                                e = e8;
                                                                                                                                                r311 = r312;
                                                                                                                                                r2 = r311;
                                                                                                                                                r38 = r311;
                                                                                                                                                try {
                                                                                                                                                    c5376.mo2404().f12020.m9434(C3610.m6440(str11), e, r10);
                                                                                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                                                                                    r39 = r38;
                                                                                                                                                    if (r2 != 0) {
                                                                                                                                                        r2.close();
                                                                                                                                                        r39 = r38;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th3) {
                                                                                                                                                    th = th3;
                                                                                                                                                    r8 = r2;
                                                                                                                                                    if (r8 != 0) {
                                                                                                                                                        r8.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th4) {
                                                                                                                                                th = th4;
                                                                                                                                                r310 = r312;
                                                                                                                                                r8 = r310;
                                                                                                                                                if (r8 != 0) {
                                                                                                                                                    r8.close();
                                                                                                                                                }
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            r314 = Query;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(c3544);
                                                                                                                                        r313 = r314;
                                                                                                                                    } catch (IOException e9) {
                                                                                                                                        r313 = Query;
                                                                                                                                        c5376.mo2404().f12020.m9434(C3610.m6440(str11), e9, str17);
                                                                                                                                    }
                                                                                                                                    if (!r313.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    Query = r313;
                                                                                                                                    r312 = r313;
                                                                                                                                } catch (SQLiteException e10) {
                                                                                                                                    e = e10;
                                                                                                                                    r311 = Query;
                                                                                                                                    r2 = r311;
                                                                                                                                    r38 = r311;
                                                                                                                                    c5376.mo2404().f12020.m9434(C3610.m6440(str11), e, r10);
                                                                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                                                                    r39 = r38;
                                                                                                                                    if (r2 != 0) {
                                                                                                                                        r2.close();
                                                                                                                                        r39 = r38;
                                                                                                                                    }
                                                                                                                                    c4466.put(strM9415, map7);
                                                                                                                                    list = r39;
                                                                                                                                    for (Integer num5 : map7.keySet()) {
                                                                                                                                        iIntValue2 = num5.intValue();
                                                                                                                                        if (this.f4883.contains(num5)) {
                                                                                                                                            c5374.mo2404().f12023.m9430(num5, "Skipping failed audience ID");
                                                                                                                                        } else {
                                                                                                                                            it7 = ((List) map7.get(num5)).iterator();
                                                                                                                                            zM7680 = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it7.hasNext()) {
                                                                                                                                                    map8 = map7;
                                                                                                                                                    c0616 = c0615;
                                                                                                                                                    num2 = num5;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                C3542 c3545 = (C3542) it7.next();
                                                                                                                                                map8 = map7;
                                                                                                                                                c0616 = c0615;
                                                                                                                                                num2 = num5;
                                                                                                                                                c43710 = new C4379(this, this.f4884, iIntValue2, c3545, 0);
                                                                                                                                                Long l3 = this.f4886;
                                                                                                                                                Long l4 = this.f4887;
                                                                                                                                                iM6332 = c3545.m6332();
                                                                                                                                                c1323 = (C1323) this.f4885.get(num2);
                                                                                                                                                if (c1323 == null) {
                                                                                                                                                    z8 = false;
                                                                                                                                                } else {
                                                                                                                                                    z8 = c1323.f4570.get(iM6332);
                                                                                                                                                }
                                                                                                                                                zM7680 = c43710.m7680(l3, l4, c5580M1379, j, c3047M2447, z8);
                                                                                                                                                if (!zM7680) {
                                                                                                                                                    this.f4883.add(num2);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                m3021(num2).m2812(c43710);
                                                                                                                                                num5 = num2;
                                                                                                                                                map7 = map8;
                                                                                                                                                c0615 = c0616;
                                                                                                                                            }
                                                                                                                                            if (!zM7680) {
                                                                                                                                                this.f4883.add(num2);
                                                                                                                                            }
                                                                                                                                            c0615 = c0616;
                                                                                                                                            map7 = map8;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            r313.close();
                                                                                                                            map7 = c4467;
                                                                                                                            r39 = r313;
                                                                                                                        } else {
                                                                                                                            ?? r315 = Query;
                                                                                                                            map7 = Collections.EMPTY_MAP;
                                                                                                                            r315.close();
                                                                                                                            r39 = r315;
                                                                                                                        }
                                                                                                                    } catch (Throwable th5) {
                                                                                                                        th = th5;
                                                                                                                        r310 = Query;
                                                                                                                    }
                                                                                                                } catch (SQLiteException e11) {
                                                                                                                    e = e11;
                                                                                                                    str11 = str10;
                                                                                                                }
                                                                                                            } catch (SQLiteException e12) {
                                                                                                                e = e12;
                                                                                                                str11 = str10;
                                                                                                                r2 = 0;
                                                                                                                r38 = list;
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                r8 = 0;
                                                                                                            }
                                                                                                            c4466.put(strM9415, map7);
                                                                                                            list = r39;
                                                                                                        } else {
                                                                                                            list = list;
                                                                                                        }
                                                                                                        while (r19.hasNext()) {
                                                                                                            iIntValue2 = num5.intValue();
                                                                                                            if (this.f4883.contains(num5)) {
                                                                                                                c5374.mo2404().f12023.m9430(num5, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it7 = ((List) map7.get(num5)).iterator();
                                                                                                                zM7680 = true;
                                                                                                                while (true) {
                                                                                                                    if (!it7.hasNext()) {
                                                                                                                        map8 = map7;
                                                                                                                        c0616 = c0615;
                                                                                                                        num2 = num5;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    C3542 c3546 = (C3542) it7.next();
                                                                                                                    map8 = map7;
                                                                                                                    c0616 = c0615;
                                                                                                                    num2 = num5;
                                                                                                                    c43710 = new C4379(this, this.f4884, iIntValue2, c3546, 0);
                                                                                                                    Long l5 = this.f4886;
                                                                                                                    Long l6 = this.f4887;
                                                                                                                    iM6332 = c3546.m6332();
                                                                                                                    c1323 = (C1323) this.f4885.get(num2);
                                                                                                                    if (c1323 == null) {
                                                                                                                        z8 = false;
                                                                                                                    } else {
                                                                                                                        z8 = c1323.f4570.get(iM6332);
                                                                                                                    }
                                                                                                                    zM7680 = c43710.m7680(l5, l6, c5580M1379, j, c3047M2447, z8);
                                                                                                                    if (!zM7680) {
                                                                                                                        this.f4883.add(num2);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    m3021(num2).m2812(c43710);
                                                                                                                    num5 = num2;
                                                                                                                    map7 = map8;
                                                                                                                    c0615 = c0616;
                                                                                                                }
                                                                                                                if (!zM7680) {
                                                                                                                    this.f4883.add(num2);
                                                                                                                }
                                                                                                                c0615 = c0616;
                                                                                                                map7 = map8;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            C4461 c44610 = new C4461();
                                                                                            it4 = list2.iterator();
                                                                                            c0796 = c44610;
                                                                                            while (it4.hasNext()) {
                                                                                                C3426 c3426 = (C3426) it4.next();
                                                                                                strM6206 = c3426.m6206();
                                                                                                map6 = (Map) c0796.get(strM6206);
                                                                                                if (map6 == null) {
                                                                                                    C1159 c1159M85113 = c5034.m8517();
                                                                                                    c5372 = (C5371) c1159M85113.f18660;
                                                                                                    str9 = this.f4884;
                                                                                                    c1159M85113.m4637();
                                                                                                    c1159M85113.mo6517();
                                                                                                    AbstractC0487.m1090(str9);
                                                                                                    AbstractC0487.m1090(strM6206);
                                                                                                    c4465 = new C4461();
                                                                                                    try {
                                                                                                        cursorQuery2 = c1159M85113.m2463().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM6206}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                    it5 = it4;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                C4630 c4631 = (C4630) ((C1209) C3117.m5718(C4630.m8013(), cursorQuery2.getBlob(1))).m1977();
                                                                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                list5 = (List) c4465.get(numValueOf5);
                                                                                                                                if (list5 == null) {
                                                                                                                                    c5373 = c5372;
                                                                                                                                    try {
                                                                                                                                        arrayList3 = new ArrayList();
                                                                                                                                        c4465.put(numValueOf5, arrayList3);
                                                                                                                                    } catch (SQLiteException e13) {
                                                                                                                                        e = e13;
                                                                                                                                        str7 = str7;
                                                                                                                                        cursor = cursorQuery2;
                                                                                                                                        try {
                                                                                                                                            c5373.mo2404().f12020.m9434(C3610.m6440(str9), e, r10);
                                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            c0796.put(strM6206, map6);
                                                                                                                                            c0797 = c0796;
                                                                                                                                            for (Integer num6 : map6.keySet()) {
                                                                                                                                                iIntValue = num6.intValue();
                                                                                                                                                if (this.f4883.contains(num6)) {
                                                                                                                                                    c5374.mo2404().f12023.m9430(num6, "Skipping failed audience ID");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                it6 = ((List) map6.get(num6)).iterator();
                                                                                                                                                zM7679 = true;
                                                                                                                                                c0798 = c0797;
                                                                                                                                                while (true) {
                                                                                                                                                    if (it6.hasNext()) {
                                                                                                                                                        c4630 = (C4630) it6.next();
                                                                                                                                                        if (Log.isLoggable(c5374.mo2404().m6441(), 2)) {
                                                                                                                                                            C5590 c5591 = c5374.mo2404().f12023;
                                                                                                                                                            if (c4630.m8016()) {
                                                                                                                                                                numValueOf4 = Integer.valueOf(c4630.m8015());
                                                                                                                                                            } else {
                                                                                                                                                                numValueOf4 = null;
                                                                                                                                                            }
                                                                                                                                                            c5591.m9431("Evaluating filter. audience, filter, property", num6, numValueOf4, c5374.f17731.m7142(c4630.m8017()));
                                                                                                                                                            c5374.mo2404().f12023.m9430(c5034.m8505().m5728(c4630), "Filter definition");
                                                                                                                                                        }
                                                                                                                                                        if (c4630.m8016()) {
                                                                                                                                                        }
                                                                                                                                                        C5590 c5592 = c5374.mo2404().f12022;
                                                                                                                                                        C1005 c1005M6440 = C3610.m6440(this.f4884);
                                                                                                                                                        if (c4630.m8016()) {
                                                                                                                                                            numValueOf3 = Integer.valueOf(c4630.m8015());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf3 = null;
                                                                                                                                                        }
                                                                                                                                                        c5592.m9434(c1005M6440, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                                        this.f4883.add(num6);
                                                                                                                                                        map6 = map6;
                                                                                                                                                        c0797 = c0798;
                                                                                                                                                    } else {
                                                                                                                                                        map6 = map6;
                                                                                                                                                        c0798 = c0798;
                                                                                                                                                    }
                                                                                                                                                    if (!zM7679) {
                                                                                                                                                        this.f4883.add(num6);
                                                                                                                                                    }
                                                                                                                                                    map6 = map6;
                                                                                                                                                    c0797 = c0798;
                                                                                                                                                    m3021(num6).m2812(c4379);
                                                                                                                                                    iIntValue = i2;
                                                                                                                                                    map6 = map6;
                                                                                                                                                    c0798 = c0798;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            str7 = str7;
                                                                                                                                            it4 = it5;
                                                                                                                                            c0796 = c0797;
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    c5373 = c5372;
                                                                                                                                    arrayList3 = list5;
                                                                                                                                }
                                                                                                                                arrayList3.add(c4631);
                                                                                                                            } catch (IOException e14) {
                                                                                                                                c5373 = c5372;
                                                                                                                                c5373.mo2404().f12020.m9434(C3610.m6440(str9), e14, "Failed to merge filter");
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                c5372 = c5373;
                                                                                                                                str7 = str7;
                                                                                                                            } catch (SQLiteException e15) {
                                                                                                                                e = e15;
                                                                                                                                cursor = cursorQuery2;
                                                                                                                                c5373.mo2404().f12020.m9434(C3610.m6440(str9), e, r10);
                                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                                if (cursor != null) {
                                                                                                                                    cursor.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e16) {
                                                                                                                            e = e16;
                                                                                                                            c5373 = c5372;
                                                                                                                            str7 = str7;
                                                                                                                            cursor = cursorQuery2;
                                                                                                                            c5373.mo2404().f12020.m9434(C3610.m6440(str9), e, r10);
                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor != null) {
                                                                                                                                cursor.close();
                                                                                                                            }
                                                                                                                            c0796.put(strM6206, map6);
                                                                                                                            c0797 = c0796;
                                                                                                                            while (r3.hasNext()) {
                                                                                                                                iIntValue = num6.intValue();
                                                                                                                                if (this.f4883.contains(num6)) {
                                                                                                                                    c5374.mo2404().f12023.m9430(num6, "Skipping failed audience ID");
                                                                                                                                    break;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                it6 = ((List) map6.get(num6)).iterator();
                                                                                                                                zM7679 = true;
                                                                                                                                c0798 = c0797;
                                                                                                                                while (true) {
                                                                                                                                    if (it6.hasNext()) {
                                                                                                                                        c4630 = (C4630) it6.next();
                                                                                                                                        if (Log.isLoggable(c5374.mo2404().m6441(), 2)) {
                                                                                                                                            C5590 c5593 = c5374.mo2404().f12023;
                                                                                                                                            if (c4630.m8016()) {
                                                                                                                                                numValueOf4 = Integer.valueOf(c4630.m8015());
                                                                                                                                            } else {
                                                                                                                                                numValueOf4 = null;
                                                                                                                                            }
                                                                                                                                            c5593.m9431("Evaluating filter. audience, filter, property", num6, numValueOf4, c5374.f17731.m7142(c4630.m8017()));
                                                                                                                                            c5374.mo2404().f12023.m9430(c5034.m8505().m5728(c4630), "Filter definition");
                                                                                                                                        }
                                                                                                                                        if (c4630.m8016()) {
                                                                                                                                        }
                                                                                                                                        C5590 c5594 = c5374.mo2404().f12022;
                                                                                                                                        C1005 c1005M6441 = C3610.m6440(this.f4884);
                                                                                                                                        if (c4630.m8016()) {
                                                                                                                                            numValueOf3 = Integer.valueOf(c4630.m8015());
                                                                                                                                        } else {
                                                                                                                                            numValueOf3 = null;
                                                                                                                                        }
                                                                                                                                        c5594.m9434(c1005M6441, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                        this.f4883.add(num6);
                                                                                                                                        map6 = map6;
                                                                                                                                        c0797 = c0798;
                                                                                                                                    } else {
                                                                                                                                        map6 = map6;
                                                                                                                                        c0798 = c0798;
                                                                                                                                    }
                                                                                                                                    if (!zM7679) {
                                                                                                                                        this.f4883.add(num6);
                                                                                                                                    }
                                                                                                                                    map6 = map6;
                                                                                                                                    c0797 = c0798;
                                                                                                                                    m3021(num6).m2812(c4379);
                                                                                                                                    iIntValue = i2;
                                                                                                                                    map6 = map6;
                                                                                                                                    c0798 = c0798;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            str7 = str7;
                                                                                                                            it4 = it5;
                                                                                                                            c0796 = c0797;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery2.close();
                                                                                                                    map6 = c4465;
                                                                                                                } else {
                                                                                                                    it5 = it4;
                                                                                                                    str7 = str7;
                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            } catch (SQLiteException e17) {
                                                                                                                e = e17;
                                                                                                                it5 = it4;
                                                                                                            }
                                                                                                            c0796.put(strM6206, map6);
                                                                                                        } catch (Throwable th8) {
                                                                                                            th = th8;
                                                                                                            cursor = cursorQuery2;
                                                                                                            if (cursor != null) {
                                                                                                                cursor.close();
                                                                                                            }
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (SQLiteException e18) {
                                                                                                        e = e18;
                                                                                                        it5 = it4;
                                                                                                        c5373 = c5372;
                                                                                                        str7 = str7;
                                                                                                        cursor = null;
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                        cursor = null;
                                                                                                    }
                                                                                                } else {
                                                                                                    it5 = it4;
                                                                                                    str7 = str7;
                                                                                                }
                                                                                                c0797 = c0796;
                                                                                                while (r3.hasNext()) {
                                                                                                    iIntValue = num6.intValue();
                                                                                                    if (this.f4883.contains(num6)) {
                                                                                                        c5374.mo2404().f12023.m9430(num6, "Skipping failed audience ID");
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it6 = ((List) map6.get(num6)).iterator();
                                                                                                    zM7679 = true;
                                                                                                    c0798 = c0797;
                                                                                                    while (true) {
                                                                                                        if (it6.hasNext()) {
                                                                                                            c4630 = (C4630) it6.next();
                                                                                                            if (Log.isLoggable(c5374.mo2404().m6441(), 2)) {
                                                                                                                C5590 c5595 = c5374.mo2404().f12023;
                                                                                                                if (c4630.m8016()) {
                                                                                                                    numValueOf4 = Integer.valueOf(c4630.m8015());
                                                                                                                } else {
                                                                                                                    numValueOf4 = null;
                                                                                                                }
                                                                                                                c5595.m9431("Evaluating filter. audience, filter, property", num6, numValueOf4, c5374.f17731.m7142(c4630.m8017()));
                                                                                                                c5374.mo2404().f12023.m9430(c5034.m8505().m5728(c4630), "Filter definition");
                                                                                                            }
                                                                                                            if (c4630.m8016()) {
                                                                                                            }
                                                                                                            C5590 c5596 = c5374.mo2404().f12022;
                                                                                                            C1005 c1005M6442 = C3610.m6440(this.f4884);
                                                                                                            if (c4630.m8016()) {
                                                                                                                numValueOf3 = Integer.valueOf(c4630.m8015());
                                                                                                            } else {
                                                                                                                numValueOf3 = null;
                                                                                                            }
                                                                                                            c5596.m9434(c1005M6442, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                            this.f4883.add(num6);
                                                                                                            map6 = map6;
                                                                                                            c0797 = c0798;
                                                                                                        } else {
                                                                                                            map6 = map6;
                                                                                                            c0798 = c0798;
                                                                                                        }
                                                                                                        if (!zM7679) {
                                                                                                            this.f4883.add(num6);
                                                                                                        }
                                                                                                        map6 = map6;
                                                                                                        c0797 = c0798;
                                                                                                        m3021(num6).m2812(c4379);
                                                                                                        iIntValue = i2;
                                                                                                        map6 = map6;
                                                                                                        c0798 = c0798;
                                                                                                    }
                                                                                                }
                                                                                                str7 = str7;
                                                                                                it4 = it5;
                                                                                                c0796 = c0797;
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = new ArrayList();
                                                                                        C2163<Integer> c2163 = (C2163) this.f4885.keySet();
                                                                                        c2163.removeAll(this.f4883);
                                                                                        for (Integer num7 : c2163) {
                                                                                            int iIntValue3 = num7.intValue();
                                                                                            C1323 c1324 = (C1323) this.f4885.get(num7);
                                                                                            AbstractC0487.m1047(c1324);
                                                                                            C1971 c1971M2811 = c1324.m2811(iIntValue3);
                                                                                            arrayList2.add(c1971M2811);
                                                                                            c1159M8518 = c5034.m8517();
                                                                                            c5371 = (C5371) c1159M8518.f18660;
                                                                                            str8 = this.f4884;
                                                                                            C3906 c3906M3864 = c1971M2811.m3864();
                                                                                            c1159M8518.m4637();
                                                                                            c1159M8518.mo6517();
                                                                                            AbstractC0487.m1090(str8);
                                                                                            AbstractC0487.m1047(c3906M3864);
                                                                                            byte[] bArrM5754 = c3906M3864.m5754();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put("app_id", str8);
                                                                                            contentValues.put(str5, num7);
                                                                                            contentValues.put("current_results", bArrM5754);
                                                                                            try {
                                                                                                try {
                                                                                                    if (c1159M8518.m2463().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        c5371.mo2404().f12020.m9430(C3610.m6440(str8), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e19) {
                                                                                                    e = e19;
                                                                                                    c5371.mo2404().f12020.m9434(C3610.m6440(str8), e, "Error storing filter results. appId");
                                                                                                }
                                                                                            } catch (SQLiteException e20) {
                                                                                                e = e20;
                                                                                            }
                                                                                        }
                                                                                        return arrayList2;
                                                                                    }
                                                                                } catch (SQLiteException e21) {
                                                                                    e = e21;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th10) {
                                                                                    th = th10;
                                                                                    r7 = 0;
                                                                                    if (r7 != 0) {
                                                                                        r7.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r0 = c4463;
                                                                                AbstractC0487.m1090(str16);
                                                                                c4464 = new C4461();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        c3908 = (C3906) map2.get(num);
                                                                                        list4 = (List) r0.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r18 = r0;
                                                                                        it3 = it2;
                                                                                        z7 = zM1162;
                                                                                        c4464.put(num, c3908);
                                                                                        r0 = r18;
                                                                                        str14 = str14;
                                                                                        it2 = it3;
                                                                                        zM1162 = z7;
                                                                                    }
                                                                                }
                                                                                str4 = str14;
                                                                                z4 = zM1162;
                                                                                map3 = c4464;
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                r7 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            z4 = zM1162;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map2;
                                                                        map4 = map3;
                                                                        while (r17.hasNext()) {
                                                                            num3.getClass();
                                                                            c3906 = (C3906) map4.get(num3);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            c4461 = new C4461();
                                                                            if (c3906 != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (c3574.m6378()) {
                                                                                        C3906 c39012 = c3906;
                                                                                        Integer numValueOf10 = Integer.valueOf(c3574.m6377());
                                                                                        if (c3574.m6379()) {
                                                                                            lValueOf = Long.valueOf(c3574.m6382());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        c4461.put(numValueOf10, lValueOf);
                                                                                        c3906 = c39012;
                                                                                    }
                                                                                }
                                                                            }
                                                                            c3907 = c3906;
                                                                            c4462 = new C4461();
                                                                            if (c3907 != null) {
                                                                                it = c3907.m6992().iterator();
                                                                                while (it.hasNext()) {
                                                                                    c3415 = (C3415) it.next();
                                                                                    if (!c3415.m6187()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map12 = map4;
                                                                            if (c3907 != null) {
                                                                                i = 0;
                                                                                while (i < c3907.m6981() * 64) {
                                                                                    if (C3117.m5701((InterfaceC1269) c3907.m6982(), i)) {
                                                                                        z6 = zM1163;
                                                                                        c5374.mo2404().f12023.m9434(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                        bitSet2.set(i);
                                                                                        if (C3117.m5701((InterfaceC1269) c3907.m6984(), i)) {
                                                                                            bitSet.set(i);
                                                                                        }
                                                                                        i++;
                                                                                        zM1163 = z6;
                                                                                    } else {
                                                                                        z6 = zM1163;
                                                                                    }
                                                                                    c4461.remove(Integer.valueOf(i));
                                                                                    i++;
                                                                                    zM1163 = z6;
                                                                                }
                                                                            }
                                                                            z5 = zM1163;
                                                                            C3906 c39013 = (C3906) map5.get(num3);
                                                                            if (z5) {
                                                                                while (r2.hasNext()) {
                                                                                    int iM6334 = c3543.m6332();
                                                                                    Integer num8 = num3;
                                                                                    jLongValue = this.f4887.longValue() / 1000;
                                                                                    if (c3543.m6329()) {
                                                                                        jLongValue = this.f4886.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iM6334);
                                                                                    if (c4461.containsKey(numValueOf)) {
                                                                                        c4461.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (c4462.containsKey(numValueOf)) {
                                                                                        c4462.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num3 = num8;
                                                                                }
                                                                            }
                                                                            this.f4885.put(num3, new C1323(this, this.f4884, c39013, bitSet, bitSet2, c4461, c4462));
                                                                            c5035 = c5035;
                                                                            zM1163 = z5;
                                                                            map5 = map5;
                                                                            obj2 = obj2;
                                                                            map = map;
                                                                            str3 = str3;
                                                                            map4 = map12;
                                                                        }
                                                                        r10 = obj2;
                                                                        c5034 = c5035;
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str18 = str3;
                                                                    if (!list.isEmpty()) {
                                                                        c0615 = new C0615(this);
                                                                        c4466 = new C4461();
                                                                        while (r17.hasNext()) {
                                                                            c5580M1379 = c0615.m1379(this.f4884, c5580);
                                                                            if (c5580M1379 != null) {
                                                                                c3047M2447 = c5034.m8517().m2447(this.f4884, c5580, c5580M1379.m9415());
                                                                                c5034.m8517().m2443("events", c3047M2447);
                                                                                if (z) {
                                                                                    j = c3047M2447.f10241;
                                                                                    strM9415 = c5580M1379.m9415();
                                                                                    map7 = (Map) c4466.get(strM9415);
                                                                                    if (map7 == null) {
                                                                                        C1159 c1159M85114 = c5034.m8517();
                                                                                        C5371 c5377 = (C5371) c1159M85114.f18660;
                                                                                        str10 = this.f4884;
                                                                                        c1159M85114.m4637();
                                                                                        c1159M85114.mo6517();
                                                                                        AbstractC0487.m1090(str10);
                                                                                        AbstractC0487.m1090(strM9415);
                                                                                        c4467 = new C4461();
                                                                                        Query = c1159M85114.m2463().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strM9415}, null, null, null);
                                                                                        if (Query.moveToFirst()) {
                                                                                            str11 = str10;
                                                                                            Query = Query;
                                                                                            r312 = list;
                                                                                            while (true) {
                                                                                                C3542 c3547 = (C3542) ((C2227) C3117.m5718(C3542.m6328(), Query.getBlob(1))).m1977();
                                                                                                numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                list6 = (List) c4467.get(numValueOf6);
                                                                                                if (list6 == null) {
                                                                                                    r312 = Query;
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    c4467.put(numValueOf6, arrayList4);
                                                                                                    r314 = r312;
                                                                                                } else {
                                                                                                    r314 = Query;
                                                                                                    arrayList4 = list6;
                                                                                                }
                                                                                                arrayList4.add(c3547);
                                                                                                r313 = r314;
                                                                                                if (!r313.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                Query = r313;
                                                                                                r312 = r313;
                                                                                            }
                                                                                            r313.close();
                                                                                            map7 = c4467;
                                                                                            r39 = r313;
                                                                                        } else {
                                                                                            ?? r316 = Query;
                                                                                            map7 = Collections.EMPTY_MAP;
                                                                                            r316.close();
                                                                                            r39 = r316;
                                                                                        }
                                                                                        c4466.put(strM9415, map7);
                                                                                        list = r39;
                                                                                    } else {
                                                                                        list = list;
                                                                                    }
                                                                                    while (r19.hasNext()) {
                                                                                        iIntValue2 = num5.intValue();
                                                                                        if (this.f4883.contains(num5)) {
                                                                                            c5374.mo2404().f12023.m9430(num5, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it7 = ((List) map7.get(num5)).iterator();
                                                                                            zM7680 = true;
                                                                                            while (true) {
                                                                                                if (!it7.hasNext()) {
                                                                                                    map8 = map7;
                                                                                                    c0616 = c0615;
                                                                                                    num2 = num5;
                                                                                                    break;
                                                                                                }
                                                                                                C3542 c3548 = (C3542) it7.next();
                                                                                                map8 = map7;
                                                                                                c0616 = c0615;
                                                                                                num2 = num5;
                                                                                                c43710 = new C4379(this, this.f4884, iIntValue2, c3548, 0);
                                                                                                Long l7 = this.f4886;
                                                                                                Long l8 = this.f4887;
                                                                                                iM6332 = c3548.m6332();
                                                                                                c1323 = (C1323) this.f4885.get(num2);
                                                                                                if (c1323 == null) {
                                                                                                    z8 = false;
                                                                                                } else {
                                                                                                    z8 = c1323.f4570.get(iM6332);
                                                                                                }
                                                                                                zM7680 = c43710.m7680(l7, l8, c5580M1379, j, c3047M2447, z8);
                                                                                                if (!zM7680) {
                                                                                                    this.f4883.add(num2);
                                                                                                    break;
                                                                                                }
                                                                                                m3021(num2).m2812(c43710);
                                                                                                num5 = num2;
                                                                                                map7 = map8;
                                                                                                c0615 = c0616;
                                                                                            }
                                                                                            if (!zM7680) {
                                                                                                this.f4883.add(num2);
                                                                                            }
                                                                                            c0615 = c0616;
                                                                                            map7 = map8;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        C4461 c44611 = new C4461();
                                                                        it4 = list2.iterator();
                                                                        c0796 = c44611;
                                                                        while (it4.hasNext()) {
                                                                            C3426 c3427 = (C3426) it4.next();
                                                                            strM6206 = c3427.m6206();
                                                                            map6 = (Map) c0796.get(strM6206);
                                                                            if (map6 == null) {
                                                                                C1159 c1159M85115 = c5034.m8517();
                                                                                c5372 = (C5371) c1159M85115.f18660;
                                                                                str9 = this.f4884;
                                                                                c1159M85115.m4637();
                                                                                c1159M85115.mo6517();
                                                                                AbstractC0487.m1090(str9);
                                                                                AbstractC0487.m1090(strM6206);
                                                                                c4465 = new C4461();
                                                                                cursorQuery2 = c1159M85115.m2463().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM6206}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    it5 = it4;
                                                                                    while (true) {
                                                                                        C4630 c4632 = (C4630) ((C1209) C3117.m5718(C4630.m8013(), cursorQuery2.getBlob(1))).m1977();
                                                                                        numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) c4465.get(numValueOf5);
                                                                                        if (list5 == null) {
                                                                                            c5373 = c5372;
                                                                                            arrayList3 = new ArrayList();
                                                                                            c4465.put(numValueOf5, arrayList3);
                                                                                        } else {
                                                                                            c5373 = c5372;
                                                                                            arrayList3 = list5;
                                                                                        }
                                                                                        arrayList3.add(c4632);
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        c5372 = c5373;
                                                                                        str7 = str7;
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    map6 = c4465;
                                                                                } else {
                                                                                    it5 = it4;
                                                                                    str7 = str7;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                c0796.put(strM6206, map6);
                                                                            } else {
                                                                                it5 = it4;
                                                                                str7 = str7;
                                                                            }
                                                                            c0797 = c0796;
                                                                            while (r3.hasNext()) {
                                                                                iIntValue = num6.intValue();
                                                                                if (this.f4883.contains(num6)) {
                                                                                    c5374.mo2404().f12023.m9430(num6, "Skipping failed audience ID");
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it6 = ((List) map6.get(num6)).iterator();
                                                                                zM7679 = true;
                                                                                c0798 = c0797;
                                                                                while (true) {
                                                                                    if (it6.hasNext()) {
                                                                                        c4630 = (C4630) it6.next();
                                                                                        if (Log.isLoggable(c5374.mo2404().m6441(), 2)) {
                                                                                            C5590 c5597 = c5374.mo2404().f12023;
                                                                                            if (c4630.m8016()) {
                                                                                                numValueOf4 = Integer.valueOf(c4630.m8015());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            c5597.m9431("Evaluating filter. audience, filter, property", num6, numValueOf4, c5374.f17731.m7142(c4630.m8017()));
                                                                                            c5374.mo2404().f12023.m9430(c5034.m8505().m5728(c4630), "Filter definition");
                                                                                        }
                                                                                        if (c4630.m8016()) {
                                                                                        }
                                                                                        C5590 c5598 = c5374.mo2404().f12022;
                                                                                        C1005 c1005M6443 = C3610.m6440(this.f4884);
                                                                                        if (c4630.m8016()) {
                                                                                            numValueOf3 = Integer.valueOf(c4630.m8015());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        c5598.m9434(c1005M6443, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                        this.f4883.add(num6);
                                                                                        map6 = map6;
                                                                                        c0797 = c0798;
                                                                                    } else {
                                                                                        map6 = map6;
                                                                                        c0798 = c0798;
                                                                                    }
                                                                                    if (!zM7679) {
                                                                                        this.f4883.add(num6);
                                                                                    }
                                                                                    map6 = map6;
                                                                                    c0797 = c0798;
                                                                                    m3021(num6).m2812(c4379);
                                                                                    iIntValue = i2;
                                                                                    map6 = map6;
                                                                                    c0798 = c0798;
                                                                                }
                                                                            }
                                                                            str7 = str7;
                                                                            it4 = it5;
                                                                            c0796 = c0797;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    C2163<Integer> c2164 = (C2163) this.f4885.keySet();
                                                                    c2164.removeAll(this.f4883);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue4 = num7.intValue();
                                                                        C1323 c1325 = (C1323) this.f4885.get(num7);
                                                                        AbstractC0487.m1047(c1325);
                                                                        C1971 c1971M2812 = c1325.m2811(iIntValue4);
                                                                        arrayList2.add(c1971M2812);
                                                                        c1159M8518 = c5034.m8517();
                                                                        c5371 = (C5371) c1159M8518.f18660;
                                                                        str8 = this.f4884;
                                                                        C3906 c3906M3865 = c1971M2812.m3864();
                                                                        c1159M8518.m4637();
                                                                        c1159M8518.mo6517();
                                                                        AbstractC0487.m1090(str8);
                                                                        AbstractC0487.m1047(c3906M3865);
                                                                        byte[] bArrM5755 = c3906M3865.m5754();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str8);
                                                                        contentValues.put(str5, num7);
                                                                        contentValues.put("current_results", bArrM5755);
                                                                        if (c1159M8518.m2463().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            c5371.mo2404().f12020.m9430(C3610.m6440(str8), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str13 = str3;
                                                                objM6440 = obj2;
                                                                r21 = r21;
                                                            } catch (SQLiteException e22) {
                                                                e = e22;
                                                                r17.mo2404().f12020.m9434(C3610.m6440(r21), e, "Database error querying filter results. appId");
                                                                Map map13 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map13;
                                                            }
                                                        } catch (SQLiteException e23) {
                                                            e = e23;
                                                            r21 = r21;
                                                            r17 = r17;
                                                            str3 = str13;
                                                            obj2 = objM6440;
                                                            r21 = r21;
                                                            r17.mo2404().f12020.m9434(C3610.m6440(r21), e, "Database error querying filter results. appId");
                                                            Map map14 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map14;
                                                            if (map2.isEmpty()) {
                                                                r10 = obj2;
                                                                c5034 = c5035;
                                                                str5 = "audience_id";
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z3) {
                                                                    String str19 = this.f4884;
                                                                    c1159M8517 = c5035.m8517();
                                                                    str6 = this.f4884;
                                                                    c1159M8517.m4637();
                                                                    c1159M8517.mo6517();
                                                                    AbstractC0487.m1090(str6);
                                                                    c4463 = new C4461();
                                                                    cursorRawQuery = c1159M8517.m2463().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) c4463.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                c4463.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        c4463 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r0 = c4463;
                                                                    AbstractC0487.m1090(str19);
                                                                    c4464 = new C4461();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            c3908 = (C3906) map2.get(num);
                                                                            list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r18 = r0;
                                                                            it3 = it2;
                                                                            z7 = zM1162;
                                                                            c4464.put(num, c3908);
                                                                            r0 = r18;
                                                                            str14 = str14;
                                                                            it2 = it3;
                                                                            zM1162 = z7;
                                                                        }
                                                                    }
                                                                    str4 = str14;
                                                                    z4 = zM1162;
                                                                    map3 = c4464;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    z4 = zM1162;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map2;
                                                                map4 = map3;
                                                                while (r17.hasNext()) {
                                                                    num3.getClass();
                                                                    c3906 = (C3906) map4.get(num3);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    c4461 = new C4461();
                                                                    if (c3906 != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (c3574.m6378()) {
                                                                                C3906 c39014 = c3906;
                                                                                Integer numValueOf11 = Integer.valueOf(c3574.m6377());
                                                                                if (c3574.m6379()) {
                                                                                    lValueOf = Long.valueOf(c3574.m6382());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                c4461.put(numValueOf11, lValueOf);
                                                                                c3906 = c39014;
                                                                            }
                                                                        }
                                                                    }
                                                                    c3907 = c3906;
                                                                    c4462 = new C4461();
                                                                    if (c3907 != null) {
                                                                        it = c3907.m6992().iterator();
                                                                        while (it.hasNext()) {
                                                                            c3415 = (C3415) it.next();
                                                                            if (!c3415.m6187()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map15 = map4;
                                                                    if (c3907 != null) {
                                                                        i = 0;
                                                                        while (i < c3907.m6981() * 64) {
                                                                            if (C3117.m5701((InterfaceC1269) c3907.m6982(), i)) {
                                                                                z6 = zM1163;
                                                                                c5374.mo2404().f12023.m9434(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                bitSet2.set(i);
                                                                                if (C3117.m5701((InterfaceC1269) c3907.m6984(), i)) {
                                                                                    bitSet.set(i);
                                                                                }
                                                                                i++;
                                                                                zM1163 = z6;
                                                                            } else {
                                                                                z6 = zM1163;
                                                                            }
                                                                            c4461.remove(Integer.valueOf(i));
                                                                            i++;
                                                                            zM1163 = z6;
                                                                        }
                                                                    }
                                                                    z5 = zM1163;
                                                                    C3906 c39015 = (C3906) map5.get(num3);
                                                                    if (z5) {
                                                                        while (r2.hasNext()) {
                                                                            int iM6335 = c3543.m6332();
                                                                            Integer num9 = num3;
                                                                            jLongValue = this.f4887.longValue() / 1000;
                                                                            if (c3543.m6329()) {
                                                                                jLongValue = this.f4886.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iM6335);
                                                                            if (c4461.containsKey(numValueOf)) {
                                                                                c4461.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (c4462.containsKey(numValueOf)) {
                                                                                c4462.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num3 = num9;
                                                                        }
                                                                    }
                                                                    this.f4885.put(num3, new C1323(this, this.f4884, c39015, bitSet, bitSet2, c4461, c4462));
                                                                    c5035 = c5035;
                                                                    zM1163 = z5;
                                                                    map5 = map5;
                                                                    obj2 = obj2;
                                                                    map = map;
                                                                    str3 = str3;
                                                                    map4 = map15;
                                                                }
                                                                r10 = obj2;
                                                                c5034 = c5035;
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str110 = str3;
                                                            if (!list.isEmpty()) {
                                                                c0615 = new C0615(this);
                                                                c4466 = new C4461();
                                                                while (r17.hasNext()) {
                                                                    c5580M1379 = c0615.m1379(this.f4884, c5580);
                                                                    if (c5580M1379 != null) {
                                                                        c3047M2447 = c5034.m8517().m2447(this.f4884, c5580, c5580M1379.m9415());
                                                                        c5034.m8517().m2443("events", c3047M2447);
                                                                        if (z) {
                                                                            j = c3047M2447.f10241;
                                                                            strM9415 = c5580M1379.m9415();
                                                                            map7 = (Map) c4466.get(strM9415);
                                                                            if (map7 == null) {
                                                                                C1159 c1159M85116 = c5034.m8517();
                                                                                C5371 c5378 = (C5371) c1159M85116.f18660;
                                                                                str10 = this.f4884;
                                                                                c1159M85116.m4637();
                                                                                c1159M85116.mo6517();
                                                                                AbstractC0487.m1090(str10);
                                                                                AbstractC0487.m1090(strM9415);
                                                                                c4467 = new C4461();
                                                                                Query = c1159M85116.m2463().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strM9415}, null, null, null);
                                                                                if (Query.moveToFirst()) {
                                                                                    str11 = str10;
                                                                                    Query = Query;
                                                                                    r312 = list;
                                                                                    while (true) {
                                                                                        C3542 c3549 = (C3542) ((C2227) C3117.m5718(C3542.m6328(), Query.getBlob(1))).m1977();
                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                        list6 = (List) c4467.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            r312 = Query;
                                                                                            arrayList4 = new ArrayList();
                                                                                            c4467.put(numValueOf6, arrayList4);
                                                                                            r314 = r312;
                                                                                        } else {
                                                                                            r314 = Query;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(c3549);
                                                                                        r313 = r314;
                                                                                        if (!r313.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        Query = r313;
                                                                                        r312 = r313;
                                                                                    }
                                                                                    r313.close();
                                                                                    map7 = c4467;
                                                                                    r39 = r313;
                                                                                } else {
                                                                                    ?? r317 = Query;
                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                    r317.close();
                                                                                    r39 = r317;
                                                                                }
                                                                                c4466.put(strM9415, map7);
                                                                                list = r39;
                                                                            } else {
                                                                                list = list;
                                                                            }
                                                                            while (r19.hasNext()) {
                                                                                iIntValue2 = num5.intValue();
                                                                                if (this.f4883.contains(num5)) {
                                                                                    c5374.mo2404().f12023.m9430(num5, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it7 = ((List) map7.get(num5)).iterator();
                                                                                    zM7680 = true;
                                                                                    while (true) {
                                                                                        if (!it7.hasNext()) {
                                                                                            map8 = map7;
                                                                                            c0616 = c0615;
                                                                                            num2 = num5;
                                                                                            break;
                                                                                        }
                                                                                        C3542 c35410 = (C3542) it7.next();
                                                                                        map8 = map7;
                                                                                        c0616 = c0615;
                                                                                        num2 = num5;
                                                                                        c43710 = new C4379(this, this.f4884, iIntValue2, c35410, 0);
                                                                                        Long l9 = this.f4886;
                                                                                        Long l10 = this.f4887;
                                                                                        iM6332 = c35410.m6332();
                                                                                        c1323 = (C1323) this.f4885.get(num2);
                                                                                        if (c1323 == null) {
                                                                                            z8 = false;
                                                                                        } else {
                                                                                            z8 = c1323.f4570.get(iM6332);
                                                                                        }
                                                                                        zM7680 = c43710.m7680(l9, l10, c5580M1379, j, c3047M2447, z8);
                                                                                        if (!zM7680) {
                                                                                            this.f4883.add(num2);
                                                                                            break;
                                                                                        }
                                                                                        m3021(num2).m2812(c43710);
                                                                                        num5 = num2;
                                                                                        map7 = map8;
                                                                                        c0615 = c0616;
                                                                                    }
                                                                                    if (!zM7680) {
                                                                                        this.f4883.add(num2);
                                                                                    }
                                                                                    c0615 = c0616;
                                                                                    map7 = map8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                C4461 c44612 = new C4461();
                                                                it4 = list2.iterator();
                                                                c0796 = c44612;
                                                                while (it4.hasNext()) {
                                                                    C3426 c3428 = (C3426) it4.next();
                                                                    strM6206 = c3428.m6206();
                                                                    map6 = (Map) c0796.get(strM6206);
                                                                    if (map6 == null) {
                                                                        C1159 c1159M85117 = c5034.m8517();
                                                                        c5372 = (C5371) c1159M85117.f18660;
                                                                        str9 = this.f4884;
                                                                        c1159M85117.m4637();
                                                                        c1159M85117.mo6517();
                                                                        AbstractC0487.m1090(str9);
                                                                        AbstractC0487.m1090(strM6206);
                                                                        c4465 = new C4461();
                                                                        cursorQuery2 = c1159M85117.m2463().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM6206}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
                                                                                C4630 c4633 = (C4630) ((C1209) C3117.m5718(C4630.m8013(), cursorQuery2.getBlob(1))).m1977();
                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) c4465.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    c5373 = c5372;
                                                                                    arrayList3 = new ArrayList();
                                                                                    c4465.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    c5373 = c5372;
                                                                                    arrayList3 = list5;
                                                                                }
                                                                                arrayList3.add(c4633);
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                c5372 = c5373;
                                                                                str7 = str7;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map6 = c4465;
                                                                        } else {
                                                                            it5 = it4;
                                                                            str7 = str7;
                                                                            map6 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        c0796.put(strM6206, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                        str7 = str7;
                                                                    }
                                                                    c0797 = c0796;
                                                                    while (r3.hasNext()) {
                                                                        iIntValue = num6.intValue();
                                                                        if (this.f4883.contains(num6)) {
                                                                            c5374.mo2404().f12023.m9430(num6, "Skipping failed audience ID");
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it6 = ((List) map6.get(num6)).iterator();
                                                                        zM7679 = true;
                                                                        c0798 = c0797;
                                                                        while (true) {
                                                                            if (it6.hasNext()) {
                                                                                c4630 = (C4630) it6.next();
                                                                                if (Log.isLoggable(c5374.mo2404().m6441(), 2)) {
                                                                                    C5590 c5599 = c5374.mo2404().f12023;
                                                                                    if (c4630.m8016()) {
                                                                                        numValueOf4 = Integer.valueOf(c4630.m8015());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    c5599.m9431("Evaluating filter. audience, filter, property", num6, numValueOf4, c5374.f17731.m7142(c4630.m8017()));
                                                                                    c5374.mo2404().f12023.m9430(c5034.m8505().m5728(c4630), "Filter definition");
                                                                                }
                                                                                if (c4630.m8016()) {
                                                                                }
                                                                                C5590 c55910 = c5374.mo2404().f12022;
                                                                                C1005 c1005M6444 = C3610.m6440(this.f4884);
                                                                                if (c4630.m8016()) {
                                                                                    numValueOf3 = Integer.valueOf(c4630.m8015());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                c55910.m9434(c1005M6444, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                this.f4883.add(num6);
                                                                                map6 = map6;
                                                                                c0797 = c0798;
                                                                            } else {
                                                                                map6 = map6;
                                                                                c0798 = c0798;
                                                                            }
                                                                            if (!zM7679) {
                                                                                this.f4883.add(num6);
                                                                            }
                                                                            map6 = map6;
                                                                            c0797 = c0798;
                                                                            m3021(num6).m2812(c4379);
                                                                            iIntValue = i2;
                                                                            map6 = map6;
                                                                            c0798 = c0798;
                                                                        }
                                                                    }
                                                                    str7 = str7;
                                                                    it4 = it5;
                                                                    c0796 = c0797;
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            C2163<Integer> c2165 = (C2163) this.f4885.keySet();
                                                            c2165.removeAll(this.f4883);
                                                            while (r3.hasNext()) {
                                                                int iIntValue5 = num7.intValue();
                                                                C1323 c1326 = (C1323) this.f4885.get(num7);
                                                                AbstractC0487.m1047(c1326);
                                                                C1971 c1971M2813 = c1326.m2811(iIntValue5);
                                                                arrayList2.add(c1971M2813);
                                                                c1159M8518 = c5034.m8517();
                                                                c5371 = (C5371) c1159M8518.f18660;
                                                                str8 = this.f4884;
                                                                C3906 c3906M3866 = c1971M2813.m3864();
                                                                c1159M8518.m4637();
                                                                c1159M8518.mo6517();
                                                                AbstractC0487.m1090(str8);
                                                                AbstractC0487.m1047(c3906M3866);
                                                                byte[] bArrM5756 = c3906M3866.m5754();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str8);
                                                                contentValues.put(str5, num7);
                                                                contentValues.put("current_results", bArrM5756);
                                                                if (c1159M8518.m2463().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    c5371.mo2404().f12020.m9430(C3610.m6440(str8), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r5 = r6;
                                                    map2 = c4468;
                                                } else {
                                                    Map map16 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map16;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r5 = r5;
                                                }
                                                if (map2.isEmpty()) {
                                                    r10 = obj2;
                                                    c5034 = c5035;
                                                    str5 = "audience_id";
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z3) {
                                                        String str111 = this.f4884;
                                                        c1159M8517 = c5035.m8517();
                                                        str6 = this.f4884;
                                                        c1159M8517.m4637();
                                                        c1159M8517.mo6517();
                                                        AbstractC0487.m1090(str6);
                                                        c4463 = new C4461();
                                                        cursorRawQuery = c1159M8517.m2463().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) c4463.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    c4463.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            c4463 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r0 = c4463;
                                                        AbstractC0487.m1090(str111);
                                                        c4464 = new C4461();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                c3908 = (C3906) map2.get(num);
                                                                list4 = (List) r0.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r18 = r0;
                                                                it3 = it2;
                                                                z7 = zM1162;
                                                                c4464.put(num, c3908);
                                                                r0 = r18;
                                                                str14 = str14;
                                                                it2 = it3;
                                                                zM1162 = z7;
                                                            }
                                                        }
                                                        str4 = str14;
                                                        z4 = zM1162;
                                                        map3 = c4464;
                                                    } else {
                                                        str4 = "audience_id";
                                                        z4 = zM1162;
                                                        map3 = map2;
                                                    }
                                                    map5 = map2;
                                                    map4 = map3;
                                                    while (r17.hasNext()) {
                                                        num3.getClass();
                                                        c3906 = (C3906) map4.get(num3);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        c4461 = new C4461();
                                                        if (c3906 != null) {
                                                            while (r3.hasNext()) {
                                                                if (c3574.m6378()) {
                                                                    C3906 c39016 = c3906;
                                                                    Integer numValueOf12 = Integer.valueOf(c3574.m6377());
                                                                    if (c3574.m6379()) {
                                                                        lValueOf = Long.valueOf(c3574.m6382());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    c4461.put(numValueOf12, lValueOf);
                                                                    c3906 = c39016;
                                                                }
                                                            }
                                                        }
                                                        c3907 = c3906;
                                                        c4462 = new C4461();
                                                        if (c3907 != null) {
                                                            it = c3907.m6992().iterator();
                                                            while (it.hasNext()) {
                                                                c3415 = (C3415) it.next();
                                                                if (!c3415.m6187()) {
                                                                }
                                                            }
                                                        }
                                                        Map map17 = map4;
                                                        if (c3907 != null) {
                                                            i = 0;
                                                            while (i < c3907.m6981() * 64) {
                                                                if (C3117.m5701((InterfaceC1269) c3907.m6982(), i)) {
                                                                    z6 = zM1163;
                                                                    c5374.mo2404().f12023.m9434(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                    bitSet2.set(i);
                                                                    if (C3117.m5701((InterfaceC1269) c3907.m6984(), i)) {
                                                                        bitSet.set(i);
                                                                    }
                                                                    i++;
                                                                    zM1163 = z6;
                                                                } else {
                                                                    z6 = zM1163;
                                                                }
                                                                c4461.remove(Integer.valueOf(i));
                                                                i++;
                                                                zM1163 = z6;
                                                            }
                                                        }
                                                        z5 = zM1163;
                                                        C3906 c39017 = (C3906) map5.get(num3);
                                                        if (z5) {
                                                            while (r2.hasNext()) {
                                                                int iM6336 = c3543.m6332();
                                                                Integer num10 = num3;
                                                                jLongValue = this.f4887.longValue() / 1000;
                                                                if (c3543.m6329()) {
                                                                    jLongValue = this.f4886.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iM6336);
                                                                if (c4461.containsKey(numValueOf)) {
                                                                    c4461.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (c4462.containsKey(numValueOf)) {
                                                                    c4462.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num3 = num10;
                                                            }
                                                        }
                                                        this.f4885.put(num3, new C1323(this, this.f4884, c39017, bitSet, bitSet2, c4461, c4462));
                                                        c5035 = c5035;
                                                        zM1163 = z5;
                                                        map5 = map5;
                                                        obj2 = obj2;
                                                        map = map;
                                                        str3 = str3;
                                                        map4 = map17;
                                                    }
                                                    r10 = obj2;
                                                    c5034 = c5035;
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str112 = str3;
                                                if (!list.isEmpty()) {
                                                    c0615 = new C0615(this);
                                                    c4466 = new C4461();
                                                    while (r17.hasNext()) {
                                                        c5580M1379 = c0615.m1379(this.f4884, c5580);
                                                        if (c5580M1379 != null) {
                                                            c3047M2447 = c5034.m8517().m2447(this.f4884, c5580, c5580M1379.m9415());
                                                            c5034.m8517().m2443("events", c3047M2447);
                                                            if (z) {
                                                                j = c3047M2447.f10241;
                                                                strM9415 = c5580M1379.m9415();
                                                                map7 = (Map) c4466.get(strM9415);
                                                                if (map7 == null) {
                                                                    C1159 c1159M85118 = c5034.m8517();
                                                                    C5371 c5379 = (C5371) c1159M85118.f18660;
                                                                    str10 = this.f4884;
                                                                    c1159M85118.m4637();
                                                                    c1159M85118.mo6517();
                                                                    AbstractC0487.m1090(str10);
                                                                    AbstractC0487.m1090(strM9415);
                                                                    c4467 = new C4461();
                                                                    Query = c1159M85118.m2463().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strM9415}, null, null, null);
                                                                    if (Query.moveToFirst()) {
                                                                        str11 = str10;
                                                                        Query = Query;
                                                                        r312 = list;
                                                                        while (true) {
                                                                            C3542 c35411 = (C3542) ((C2227) C3117.m5718(C3542.m6328(), Query.getBlob(1))).m1977();
                                                                            numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                            list6 = (List) c4467.get(numValueOf6);
                                                                            if (list6 == null) {
                                                                                r312 = Query;
                                                                                arrayList4 = new ArrayList();
                                                                                c4467.put(numValueOf6, arrayList4);
                                                                                r314 = r312;
                                                                            } else {
                                                                                r314 = Query;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(c35411);
                                                                            r313 = r314;
                                                                            if (!r313.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            Query = r313;
                                                                            r312 = r313;
                                                                        }
                                                                        r313.close();
                                                                        map7 = c4467;
                                                                        r39 = r313;
                                                                    } else {
                                                                        ?? r318 = Query;
                                                                        map7 = Collections.EMPTY_MAP;
                                                                        r318.close();
                                                                        r39 = r318;
                                                                    }
                                                                    c4466.put(strM9415, map7);
                                                                    list = r39;
                                                                } else {
                                                                    list = list;
                                                                }
                                                                while (r19.hasNext()) {
                                                                    iIntValue2 = num5.intValue();
                                                                    if (this.f4883.contains(num5)) {
                                                                        c5374.mo2404().f12023.m9430(num5, "Skipping failed audience ID");
                                                                    } else {
                                                                        it7 = ((List) map7.get(num5)).iterator();
                                                                        zM7680 = true;
                                                                        while (true) {
                                                                            if (!it7.hasNext()) {
                                                                                map8 = map7;
                                                                                c0616 = c0615;
                                                                                num2 = num5;
                                                                                break;
                                                                            }
                                                                            C3542 c35412 = (C3542) it7.next();
                                                                            map8 = map7;
                                                                            c0616 = c0615;
                                                                            num2 = num5;
                                                                            c43710 = new C4379(this, this.f4884, iIntValue2, c35412, 0);
                                                                            Long l11 = this.f4886;
                                                                            Long l12 = this.f4887;
                                                                            iM6332 = c35412.m6332();
                                                                            c1323 = (C1323) this.f4885.get(num2);
                                                                            if (c1323 == null) {
                                                                                z8 = false;
                                                                            } else {
                                                                                z8 = c1323.f4570.get(iM6332);
                                                                            }
                                                                            zM7680 = c43710.m7680(l11, l12, c5580M1379, j, c3047M2447, z8);
                                                                            if (!zM7680) {
                                                                                this.f4883.add(num2);
                                                                                break;
                                                                            }
                                                                            m3021(num2).m2812(c43710);
                                                                            num5 = num2;
                                                                            map7 = map8;
                                                                            c0615 = c0616;
                                                                        }
                                                                        if (!zM7680) {
                                                                            this.f4883.add(num2);
                                                                        }
                                                                        c0615 = c0616;
                                                                        map7 = map8;
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    C4461 c44613 = new C4461();
                                                    it4 = list2.iterator();
                                                    c0796 = c44613;
                                                    while (it4.hasNext()) {
                                                        C3426 c3429 = (C3426) it4.next();
                                                        strM6206 = c3429.m6206();
                                                        map6 = (Map) c0796.get(strM6206);
                                                        if (map6 == null) {
                                                            C1159 c1159M85119 = c5034.m8517();
                                                            c5372 = (C5371) c1159M85119.f18660;
                                                            str9 = this.f4884;
                                                            c1159M85119.m4637();
                                                            c1159M85119.mo6517();
                                                            AbstractC0487.m1090(str9);
                                                            AbstractC0487.m1090(strM6206);
                                                            c4465 = new C4461();
                                                            cursorQuery2 = c1159M85119.m2463().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM6206}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                it5 = it4;
                                                                while (true) {
                                                                    C4630 c4634 = (C4630) ((C1209) C3117.m5718(C4630.m8013(), cursorQuery2.getBlob(1))).m1977();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) c4465.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        c5373 = c5372;
                                                                        arrayList3 = new ArrayList();
                                                                        c4465.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        c5373 = c5372;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(c4634);
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    c5372 = c5373;
                                                                    str7 = str7;
                                                                }
                                                                cursorQuery2.close();
                                                                map6 = c4465;
                                                            } else {
                                                                it5 = it4;
                                                                str7 = str7;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            c0796.put(strM6206, map6);
                                                        } else {
                                                            it5 = it4;
                                                            str7 = str7;
                                                        }
                                                        c0797 = c0796;
                                                        while (r3.hasNext()) {
                                                            iIntValue = num6.intValue();
                                                            if (this.f4883.contains(num6)) {
                                                                c5374.mo2404().f12023.m9430(num6, "Skipping failed audience ID");
                                                                break;
                                                                break;
                                                            }
                                                            it6 = ((List) map6.get(num6)).iterator();
                                                            zM7679 = true;
                                                            c0798 = c0797;
                                                            while (true) {
                                                                if (it6.hasNext()) {
                                                                    c4630 = (C4630) it6.next();
                                                                    if (Log.isLoggable(c5374.mo2404().m6441(), 2)) {
                                                                        C5590 c55911 = c5374.mo2404().f12023;
                                                                        if (c4630.m8016()) {
                                                                            numValueOf4 = Integer.valueOf(c4630.m8015());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        c55911.m9431("Evaluating filter. audience, filter, property", num6, numValueOf4, c5374.f17731.m7142(c4630.m8017()));
                                                                        c5374.mo2404().f12023.m9430(c5034.m8505().m5728(c4630), "Filter definition");
                                                                    }
                                                                    if (c4630.m8016()) {
                                                                    }
                                                                    C5590 c55912 = c5374.mo2404().f12022;
                                                                    C1005 c1005M6445 = C3610.m6440(this.f4884);
                                                                    if (c4630.m8016()) {
                                                                        numValueOf3 = Integer.valueOf(c4630.m8015());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    c55912.m9434(c1005M6445, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                    this.f4883.add(num6);
                                                                    map6 = map6;
                                                                    c0797 = c0798;
                                                                } else {
                                                                    map6 = map6;
                                                                    c0798 = c0798;
                                                                }
                                                                if (!zM7679) {
                                                                    this.f4883.add(num6);
                                                                }
                                                                map6 = map6;
                                                                c0797 = c0798;
                                                                m3021(num6).m2812(c4379);
                                                                iIntValue = i2;
                                                                map6 = map6;
                                                                c0798 = c0798;
                                                            }
                                                        }
                                                        str7 = str7;
                                                        it4 = it5;
                                                        c0796 = c0797;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                C2163<Integer> c2166 = (C2163) this.f4885.keySet();
                                                c2166.removeAll(this.f4883);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num7.intValue();
                                                    C1323 c1327 = (C1323) this.f4885.get(num7);
                                                    AbstractC0487.m1047(c1327);
                                                    C1971 c1971M2814 = c1327.m2811(iIntValue6);
                                                    arrayList2.add(c1971M2814);
                                                    c1159M8518 = c5034.m8517();
                                                    c5371 = (C5371) c1159M8518.f18660;
                                                    str8 = this.f4884;
                                                    C3906 c3906M3867 = c1971M2814.m3864();
                                                    c1159M8518.m4637();
                                                    c1159M8518.mo6517();
                                                    AbstractC0487.m1090(str8);
                                                    AbstractC0487.m1047(c3906M3867);
                                                    byte[] bArrM5757 = c3906M3867.m5754();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str8);
                                                    contentValues.put(str5, num7);
                                                    contentValues.put("current_results", bArrM5757);
                                                    if (c1159M8518.m2463().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        c5371.mo2404().f12020.m9430(C3610.m6440(str8), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        r111.close();
                                        map = c4469;
                                    } else {
                                        str2 = "data";
                                        Query2.close();
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    r19 = Query2;
                                }
                            } catch (SQLiteException e24) {
                                e = e24;
                                str2 = "data";
                            }
                        } catch (SQLiteException e25) {
                            e = e25;
                            str2 = "data";
                            r9 = 0;
                        } catch (Throwable th13) {
                            th = th13;
                            r9 = 0;
                        }
                        C1159 c1159M851110 = c5035.m8517();
                        obj = (C5371) c1159M851110.f18660;
                        r5 = this.f4884;
                        c1159M851110.m4637();
                        c1159M851110.mo6517();
                        AbstractC0487.m1090(r5);
                        cursorQuery = c1159M851110.m2463().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            Map map18 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map18;
                            str3 = "Failed to merge filter. appId";
                            obj2 = "Database error querying filters. appId";
                            obj = obj;
                            r5 = r5;
                        } else {
                            c4468 = new C4461();
                            r17 = obj;
                            r21 = r5;
                            while (true) {
                                i3 = cursorQuery.getInt(0);
                                C3906 c39018 = (C3906) ((C3418) C3117.m5718(C3906.m6979(), cursorQuery.getBlob(1))).m1977();
                                Object objValueOf2 = Integer.valueOf(i3);
                                c4468.put(objValueOf2, c39018);
                                str3 = str13;
                                obj2 = objM6440;
                                obj3 = objValueOf2;
                                r6 = r21;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                str13 = str3;
                                objM6440 = obj2;
                                r21 = r21;
                            }
                            cursorQuery.close();
                            obj = obj3;
                            r5 = r6;
                            map2 = c4468;
                        }
                        if (map2.isEmpty()) {
                            r10 = obj2;
                            c5034 = c5035;
                            str5 = "audience_id";
                        } else {
                            HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                            if (z3) {
                                String str113 = this.f4884;
                                c1159M8517 = c5035.m8517();
                                str6 = this.f4884;
                                c1159M8517.m4637();
                                c1159M8517.mo6517();
                                AbstractC0487.m1090(str6);
                                c4463 = new C4461();
                                cursorRawQuery = c1159M8517.m2463().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) c4463.get(numValueOf2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            c4463.put(numValueOf2, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    c4463 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r0 = c4463;
                                AbstractC0487.m1090(str113);
                                c4464 = new C4461();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        c3908 = (C3906) map2.get(num);
                                        list4 = (List) r0.get(num);
                                        if (list4 != null || list4.isEmpty()) {
                                            r18 = r0;
                                            it3 = it2;
                                            z7 = zM1162;
                                            c4464.put(num, c3908);
                                            r0 = r18;
                                            str14 = str14;
                                            it2 = it3;
                                            zM1162 = z7;
                                        } else {
                                            ?? r112 = r0;
                                            it3 = it2;
                                            List listM5724 = c5035.m8505().m5724((InterfaceC1269) c3908.m6984(), list4);
                                            if (listM5724.isEmpty()) {
                                                r0 = r112;
                                                it2 = it3;
                                            } else {
                                                C3418 c3418 = (C3418) c3908.m8829();
                                                c3418.m6194();
                                                c3418.m1979();
                                                ((C3906) c3418.f3388).m6994(listM5724);
                                                List listM5725 = c5035.m8505().m5724((InterfaceC1269) c3908.m6982(), list4);
                                                c3418.m6195();
                                                c3418.m1979();
                                                ((C3906) c3418.f3388).m6989(listM5725);
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it9 = c3908.m6995().iterator();
                                                while (it9.hasNext()) {
                                                    Iterator it10 = it9;
                                                    C3574 c3575 = (C3574) it9.next();
                                                    boolean z9 = zM1162;
                                                    if (!list4.contains(Integer.valueOf(c3575.m6377()))) {
                                                        arrayList6.add(c3575);
                                                    }
                                                    it9 = it10;
                                                    zM1162 = z9;
                                                }
                                                z7 = zM1162;
                                                c3418.m6196();
                                                c3418.m1979();
                                                ((C3906) c3418.f3388).m6987(arrayList6);
                                                ArrayList arrayList7 = new ArrayList();
                                                for (C3415 c3416 : c3908.m6992()) {
                                                    if (!list4.contains(Integer.valueOf(c3416.m6186()))) {
                                                        arrayList7.add(c3416);
                                                    }
                                                }
                                                c3418.m6193();
                                                c3418.m1979();
                                                ((C3906) c3418.f3388).m6990(arrayList7);
                                                c4464.put(num, (C3906) c3418.m1977());
                                                r18 = r112;
                                                r0 = r18;
                                                str14 = str14;
                                                it2 = it3;
                                                zM1162 = z7;
                                            }
                                        }
                                    }
                                }
                                str4 = str14;
                                z4 = zM1162;
                                map3 = c4464;
                            } else {
                                str4 = "audience_id";
                                z4 = zM1162;
                                map3 = map2;
                            }
                            map5 = map2;
                            map4 = map3;
                            while (r17.hasNext()) {
                                num3.getClass();
                                c3906 = (C3906) map4.get(num3);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                c4461 = new C4461();
                                if (c3906 != null && c3906.m6986() != 0) {
                                    while (r3.hasNext()) {
                                        if (c3574.m6378()) {
                                            C3906 c39019 = c3906;
                                            Integer numValueOf13 = Integer.valueOf(c3574.m6377());
                                            if (c3574.m6379()) {
                                                lValueOf = Long.valueOf(c3574.m6382());
                                            } else {
                                                lValueOf = null;
                                            }
                                            c4461.put(numValueOf13, lValueOf);
                                            c3906 = c39019;
                                        }
                                    }
                                }
                                c3907 = c3906;
                                c4462 = new C4461();
                                if (c3907 != null && c3907.m6985() != 0) {
                                    it = c3907.m6992().iterator();
                                    while (it.hasNext()) {
                                        c3415 = (C3415) it.next();
                                        if (!c3415.m6187() && c3415.m6191() > 0) {
                                            c4462.put(Integer.valueOf(c3415.m6186()), Long.valueOf(c3415.m6192(c3415.m6191() - 1)));
                                            it = it;
                                            map4 = map4;
                                        }
                                    }
                                }
                                Map map19 = map4;
                                if (c3907 != null) {
                                    i = 0;
                                    while (i < c3907.m6981() * 64) {
                                        if (C3117.m5701((InterfaceC1269) c3907.m6982(), i)) {
                                            z6 = zM1163;
                                            c5374.mo2404().f12023.m9434(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                            bitSet2.set(i);
                                            if (C3117.m5701((InterfaceC1269) c3907.m6984(), i)) {
                                                bitSet.set(i);
                                            }
                                            i++;
                                            zM1163 = z6;
                                        } else {
                                            z6 = zM1163;
                                        }
                                        c4461.remove(Integer.valueOf(i));
                                        i++;
                                        zM1163 = z6;
                                    }
                                }
                                z5 = zM1163;
                                C3906 c390110 = (C3906) map5.get(num3);
                                if (z5 && z4 && (list3 = (List) map.get(num3)) != null && this.f4887 != null && this.f4886 != null) {
                                    while (r2.hasNext()) {
                                        int iM6337 = c3543.m6332();
                                        Integer num11 = num3;
                                        jLongValue = this.f4887.longValue() / 1000;
                                        if (c3543.m6329()) {
                                            jLongValue = this.f4886.longValue() / 1000;
                                        }
                                        numValueOf = Integer.valueOf(iM6337);
                                        if (c4461.containsKey(numValueOf)) {
                                            c4461.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        if (c4462.containsKey(numValueOf)) {
                                            c4462.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        num3 = num11;
                                    }
                                }
                                this.f4885.put(num3, new C1323(this, this.f4884, c390110, bitSet, bitSet2, c4461, c4462));
                                c5035 = c5035;
                                zM1163 = z5;
                                map5 = map5;
                                obj2 = obj2;
                                map = map;
                                str3 = str3;
                                map4 = map19;
                            }
                            r10 = obj2;
                            c5034 = c5035;
                            str5 = str4;
                        }
                        str7 = str2;
                        String str114 = str3;
                        if (!list.isEmpty()) {
                            c0615 = new C0615(this);
                            c4466 = new C4461();
                            while (r17.hasNext()) {
                                c5580M1379 = c0615.m1379(this.f4884, c5580);
                                if (c5580M1379 != null) {
                                    c3047M2447 = c5034.m8517().m2447(this.f4884, c5580, c5580M1379.m9415());
                                    c5034.m8517().m2443("events", c3047M2447);
                                    if (z) {
                                        j = c3047M2447.f10241;
                                        strM9415 = c5580M1379.m9415();
                                        map7 = (Map) c4466.get(strM9415);
                                        if (map7 == null) {
                                            C1159 c1159M851111 = c5034.m8517();
                                            C5371 c53710 = (C5371) c1159M851111.f18660;
                                            str10 = this.f4884;
                                            c1159M851111.m4637();
                                            c1159M851111.mo6517();
                                            AbstractC0487.m1090(str10);
                                            AbstractC0487.m1090(strM9415);
                                            c4467 = new C4461();
                                            Query = c1159M851111.m2463().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strM9415}, null, null, null);
                                            if (Query.moveToFirst()) {
                                                str11 = str10;
                                                Query = Query;
                                                r312 = list;
                                                while (true) {
                                                    C3542 c35413 = (C3542) ((C2227) C3117.m5718(C3542.m6328(), Query.getBlob(1))).m1977();
                                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                    list6 = (List) c4467.get(numValueOf6);
                                                    if (list6 == null) {
                                                        r312 = Query;
                                                        arrayList4 = new ArrayList();
                                                        c4467.put(numValueOf6, arrayList4);
                                                        r314 = r312;
                                                    } else {
                                                        r314 = Query;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(c35413);
                                                    r313 = r314;
                                                    if (!r313.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    Query = r313;
                                                    r312 = r313;
                                                }
                                                r313.close();
                                                map7 = c4467;
                                                r39 = r313;
                                            } else {
                                                ?? r319 = Query;
                                                map7 = Collections.EMPTY_MAP;
                                                r319.close();
                                                r39 = r319;
                                            }
                                            c4466.put(strM9415, map7);
                                            list = r39;
                                        } else {
                                            list = list;
                                        }
                                        while (r19.hasNext()) {
                                            iIntValue2 = num5.intValue();
                                            if (this.f4883.contains(num5)) {
                                                c5374.mo2404().f12023.m9430(num5, "Skipping failed audience ID");
                                            } else {
                                                it7 = ((List) map7.get(num5)).iterator();
                                                zM7680 = true;
                                                while (true) {
                                                    if (!it7.hasNext()) {
                                                        map8 = map7;
                                                        c0616 = c0615;
                                                        num2 = num5;
                                                        break;
                                                    }
                                                    C3542 c35414 = (C3542) it7.next();
                                                    map8 = map7;
                                                    c0616 = c0615;
                                                    num2 = num5;
                                                    c43710 = new C4379(this, this.f4884, iIntValue2, c35414, 0);
                                                    Long l13 = this.f4886;
                                                    Long l14 = this.f4887;
                                                    iM6332 = c35414.m6332();
                                                    c1323 = (C1323) this.f4885.get(num2);
                                                    if (c1323 == null) {
                                                        z8 = false;
                                                    } else {
                                                        z8 = c1323.f4570.get(iM6332);
                                                    }
                                                    zM7680 = c43710.m7680(l13, l14, c5580M1379, j, c3047M2447, z8);
                                                    if (!zM7680) {
                                                        this.f4883.add(num2);
                                                        break;
                                                    }
                                                    m3021(num2).m2812(c43710);
                                                    num5 = num2;
                                                    map7 = map8;
                                                    c0615 = c0616;
                                                }
                                                if (!zM7680) {
                                                    this.f4883.add(num2);
                                                }
                                                c0615 = c0616;
                                                map7 = map8;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            C4461 c44614 = new C4461();
                            it4 = list2.iterator();
                            c0796 = c44614;
                            while (it4.hasNext()) {
                                C3426 c34210 = (C3426) it4.next();
                                strM6206 = c34210.m6206();
                                map6 = (Map) c0796.get(strM6206);
                                if (map6 == null) {
                                    C1159 c1159M851112 = c5034.m8517();
                                    c5372 = (C5371) c1159M851112.f18660;
                                    str9 = this.f4884;
                                    c1159M851112.m4637();
                                    c1159M851112.mo6517();
                                    AbstractC0487.m1090(str9);
                                    AbstractC0487.m1090(strM6206);
                                    c4465 = new C4461();
                                    cursorQuery2 = c1159M851112.m2463().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM6206}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        it5 = it4;
                                        while (true) {
                                            C4630 c4635 = (C4630) ((C1209) C3117.m5718(C4630.m8013(), cursorQuery2.getBlob(1))).m1977();
                                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) c4465.get(numValueOf5);
                                            if (list5 == null) {
                                                c5373 = c5372;
                                                arrayList3 = new ArrayList();
                                                c4465.put(numValueOf5, arrayList3);
                                            } else {
                                                c5373 = c5372;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(c4635);
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            c5372 = c5373;
                                            str7 = str7;
                                        }
                                        cursorQuery2.close();
                                        map6 = c4465;
                                    } else {
                                        it5 = it4;
                                        str7 = str7;
                                        map6 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    c0796.put(strM6206, map6);
                                } else {
                                    it5 = it4;
                                    str7 = str7;
                                }
                                c0797 = c0796;
                                while (r3.hasNext()) {
                                    iIntValue = num6.intValue();
                                    if (this.f4883.contains(num6)) {
                                        c5374.mo2404().f12023.m9430(num6, "Skipping failed audience ID");
                                        break;
                                        break;
                                    }
                                    it6 = ((List) map6.get(num6)).iterator();
                                    zM7679 = true;
                                    c0798 = c0797;
                                    while (true) {
                                        if (it6.hasNext()) {
                                            c4630 = (C4630) it6.next();
                                            if (Log.isLoggable(c5374.mo2404().m6441(), 2)) {
                                                C5590 c55913 = c5374.mo2404().f12023;
                                                if (c4630.m8016()) {
                                                    numValueOf4 = Integer.valueOf(c4630.m8015());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                c55913.m9431("Evaluating filter. audience, filter, property", num6, numValueOf4, c5374.f17731.m7142(c4630.m8017()));
                                                c5374.mo2404().f12023.m9430(c5034.m8505().m5728(c4630), "Filter definition");
                                            }
                                            if (c4630.m8016() || c4630.m8015() > 256) {
                                                C5590 c55914 = c5374.mo2404().f12022;
                                                C1005 c1005M6446 = C3610.m6440(this.f4884);
                                                if (c4630.m8016()) {
                                                    numValueOf3 = Integer.valueOf(c4630.m8015());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                c55914.m9434(c1005M6446, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                this.f4883.add(num6);
                                                map6 = map6;
                                                c0797 = c0798;
                                            } else {
                                                i2 = iIntValue;
                                                c4379 = new C4379(this, this.f4884, i2, c4630, 1);
                                                Long l15 = this.f4886;
                                                Long l16 = this.f4887;
                                                int iM8015 = c4630.m8015();
                                                C1323 c1328 = (C1323) this.f4885.get(num6);
                                                zM7679 = c4379.m7679(l15, l16, c34210, c1328 == null ? false : c1328.f4570.get(iM8015));
                                                if (zM7679) {
                                                    m3021(num6).m2812(c4379);
                                                    iIntValue = i2;
                                                    map6 = map6;
                                                    c0798 = c0798;
                                                } else {
                                                    this.f4883.add(num6);
                                                    c0798 = c0798;
                                                }
                                            }
                                        } else {
                                            map6 = map6;
                                            c0798 = c0798;
                                        }
                                        if (!zM7679) {
                                            this.f4883.add(num6);
                                        }
                                        map6 = map6;
                                        c0797 = c0798;
                                    }
                                }
                                str7 = str7;
                                it4 = it5;
                                c0796 = c0797;
                            }
                        }
                        arrayList2 = new ArrayList();
                        C2163<Integer> c2167 = (C2163) this.f4885.keySet();
                        c2167.removeAll(this.f4883);
                        while (r3.hasNext()) {
                            int iIntValue7 = num7.intValue();
                            C1323 c1329 = (C1323) this.f4885.get(num7);
                            AbstractC0487.m1047(c1329);
                            C1971 c1971M2815 = c1329.m2811(iIntValue7);
                            arrayList2.add(c1971M2815);
                            c1159M8518 = c5034.m8517();
                            c5371 = (C5371) c1159M8518.f18660;
                            str8 = this.f4884;
                            C3906 c3906M3868 = c1971M2815.m3864();
                            c1159M8518.m4637();
                            c1159M8518.mo6517();
                            AbstractC0487.m1090(str8);
                            AbstractC0487.m1047(c3906M3868);
                            byte[] bArrM5758 = c3906M3868.m5754();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str8);
                            contentValues.put(str5, num7);
                            contentValues.put("current_results", bArrM5758);
                            if (c1159M8518.m2463().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                c5371.mo2404().f12020.m9430(C3610.m6440(str8), "Failed to insert filter results (got -1). appId");
                            }
                        }
                        return arrayList2;
                    }
                    z3 = z2;
                    str2 = "data";
                    if (cursorQuery.moveToFirst()) {
                        Map map110 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map110;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r5 = r5;
                    } else {
                        c4468 = new C4461();
                        r17 = obj;
                        r21 = r5;
                        while (true) {
                            i3 = cursorQuery.getInt(0);
                            C3906 c390111 = (C3906) ((C3418) C3117.m5718(C3906.m6979(), cursorQuery.getBlob(1))).m1977();
                            Object objValueOf3 = Integer.valueOf(i3);
                            c4468.put(objValueOf3, c390111);
                            str3 = str13;
                            obj2 = objM6440;
                            obj3 = objValueOf3;
                            r6 = r21;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str13 = str3;
                            objM6440 = obj2;
                            r21 = r21;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r5 = r6;
                        map2 = c4468;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e26) {
                e = e26;
                r17 = obj;
                r21 = r5;
            }
            cursorQuery = c1159M851110.m2463().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
        } catch (SQLiteException e27) {
            e = e27;
            r17 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r21 = r5;
            cursorQuery = null;
        } catch (Throwable th15) {
            th = th15;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map9;
        C1159 c1159M851113 = c5035.m8517();
        obj = (C5371) c1159M851113.f18660;
        r5 = this.f4884;
        c1159M851113.m4637();
        c1159M851113.mo6517();
        AbstractC0487.m1090(r5);
        if (map2.isEmpty()) {
            r10 = obj2;
            c5034 = c5035;
            str5 = "audience_id";
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z3) {
                String str115 = this.f4884;
                c1159M8517 = c5035.m8517();
                str6 = this.f4884;
                c1159M8517.m4637();
                c1159M8517.mo6517();
                AbstractC0487.m1090(str6);
                c4463 = new C4461();
                cursorRawQuery = c1159M8517.m2463().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) c4463.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c4463.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    c4463 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r0 = c4463;
                AbstractC0487.m1090(str115);
                c4464 = new C4461();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        c3908 = (C3906) map2.get(num);
                        list4 = (List) r0.get(num);
                        if (list4 != null) {
                        }
                        r18 = r0;
                        it3 = it2;
                        z7 = zM1162;
                        c4464.put(num, c3908);
                        r0 = r18;
                        str14 = str14;
                        it2 = it3;
                        zM1162 = z7;
                    }
                }
                str4 = str14;
                z4 = zM1162;
                map3 = c4464;
            } else {
                str4 = "audience_id";
                z4 = zM1162;
                map3 = map2;
            }
            map5 = map2;
            map4 = map3;
            while (r17.hasNext()) {
                num3.getClass();
                c3906 = (C3906) map4.get(num3);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                c4461 = new C4461();
                if (c3906 != null) {
                    while (r3.hasNext()) {
                        if (c3574.m6378()) {
                            C3906 c390112 = c3906;
                            Integer numValueOf14 = Integer.valueOf(c3574.m6377());
                            if (c3574.m6379()) {
                                lValueOf = Long.valueOf(c3574.m6382());
                            } else {
                                lValueOf = null;
                            }
                            c4461.put(numValueOf14, lValueOf);
                            c3906 = c390112;
                        }
                    }
                }
                c3907 = c3906;
                c4462 = new C4461();
                if (c3907 != null) {
                    it = c3907.m6992().iterator();
                    while (it.hasNext()) {
                        c3415 = (C3415) it.next();
                        if (!c3415.m6187()) {
                        }
                    }
                }
                Map map111 = map4;
                if (c3907 != null) {
                    i = 0;
                    while (i < c3907.m6981() * 64) {
                        if (C3117.m5701((InterfaceC1269) c3907.m6982(), i)) {
                            z6 = zM1163;
                            c5374.mo2404().f12023.m9434(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                            bitSet2.set(i);
                            if (C3117.m5701((InterfaceC1269) c3907.m6984(), i)) {
                                bitSet.set(i);
                            }
                            i++;
                            zM1163 = z6;
                        } else {
                            z6 = zM1163;
                        }
                        c4461.remove(Integer.valueOf(i));
                        i++;
                        zM1163 = z6;
                    }
                }
                z5 = zM1163;
                C3906 c390113 = (C3906) map5.get(num3);
                if (z5) {
                    while (r2.hasNext()) {
                        int iM6338 = c3543.m6332();
                        Integer num12 = num3;
                        jLongValue = this.f4887.longValue() / 1000;
                        if (c3543.m6329()) {
                            jLongValue = this.f4886.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iM6338);
                        if (c4461.containsKey(numValueOf)) {
                            c4461.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (c4462.containsKey(numValueOf)) {
                            c4462.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num3 = num12;
                    }
                }
                this.f4885.put(num3, new C1323(this, this.f4884, c390113, bitSet, bitSet2, c4461, c4462));
                c5035 = c5035;
                zM1163 = z5;
                map5 = map5;
                obj2 = obj2;
                map = map;
                str3 = str3;
                map4 = map111;
            }
            r10 = obj2;
            c5034 = c5035;
            str5 = str4;
        }
        str7 = str2;
        String str116 = str3;
        if (!list.isEmpty()) {
            c0615 = new C0615(this);
            c4466 = new C4461();
            while (r17.hasNext()) {
                c5580M1379 = c0615.m1379(this.f4884, c5580);
                if (c5580M1379 != null) {
                    c3047M2447 = c5034.m8517().m2447(this.f4884, c5580, c5580M1379.m9415());
                    c5034.m8517().m2443("events", c3047M2447);
                    if (z) {
                        j = c3047M2447.f10241;
                        strM9415 = c5580M1379.m9415();
                        map7 = (Map) c4466.get(strM9415);
                        if (map7 == null) {
                            C1159 c1159M851114 = c5034.m8517();
                            C5371 c53711 = (C5371) c1159M851114.f18660;
                            str10 = this.f4884;
                            c1159M851114.m4637();
                            c1159M851114.mo6517();
                            AbstractC0487.m1090(str10);
                            AbstractC0487.m1090(strM9415);
                            c4467 = new C4461();
                            Query = c1159M851114.m2463().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strM9415}, null, null, null);
                            if (Query.moveToFirst()) {
                                str11 = str10;
                                Query = Query;
                                r312 = list;
                                while (true) {
                                    C3542 c35415 = (C3542) ((C2227) C3117.m5718(C3542.m6328(), Query.getBlob(1))).m1977();
                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                    list6 = (List) c4467.get(numValueOf6);
                                    if (list6 == null) {
                                        r312 = Query;
                                        arrayList4 = new ArrayList();
                                        c4467.put(numValueOf6, arrayList4);
                                        r314 = r312;
                                    } else {
                                        r314 = Query;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(c35415);
                                    r313 = r314;
                                    if (!r313.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    Query = r313;
                                    r312 = r313;
                                }
                                r313.close();
                                map7 = c4467;
                                r39 = r313;
                            } else {
                                ?? r3110 = Query;
                                map7 = Collections.EMPTY_MAP;
                                r3110.close();
                                r39 = r3110;
                            }
                            c4466.put(strM9415, map7);
                            list = r39;
                        } else {
                            list = list;
                        }
                        while (r19.hasNext()) {
                            iIntValue2 = num5.intValue();
                            if (this.f4883.contains(num5)) {
                                c5374.mo2404().f12023.m9430(num5, "Skipping failed audience ID");
                            } else {
                                it7 = ((List) map7.get(num5)).iterator();
                                zM7680 = true;
                                while (true) {
                                    if (!it7.hasNext()) {
                                        map8 = map7;
                                        c0616 = c0615;
                                        num2 = num5;
                                        break;
                                    }
                                    C3542 c35416 = (C3542) it7.next();
                                    map8 = map7;
                                    c0616 = c0615;
                                    num2 = num5;
                                    c43710 = new C4379(this, this.f4884, iIntValue2, c35416, 0);
                                    Long l17 = this.f4886;
                                    Long l18 = this.f4887;
                                    iM6332 = c35416.m6332();
                                    c1323 = (C1323) this.f4885.get(num2);
                                    if (c1323 == null) {
                                        z8 = false;
                                    } else {
                                        z8 = c1323.f4570.get(iM6332);
                                    }
                                    zM7680 = c43710.m7680(l17, l18, c5580M1379, j, c3047M2447, z8);
                                    if (!zM7680) {
                                        this.f4883.add(num2);
                                        break;
                                    }
                                    m3021(num2).m2812(c43710);
                                    num5 = num2;
                                    map7 = map8;
                                    c0615 = c0616;
                                }
                                if (!zM7680) {
                                    this.f4883.add(num2);
                                }
                                c0615 = c0616;
                                map7 = map8;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            C4461 c44615 = new C4461();
            it4 = list2.iterator();
            c0796 = c44615;
            while (it4.hasNext()) {
                C3426 c34211 = (C3426) it4.next();
                strM6206 = c34211.m6206();
                map6 = (Map) c0796.get(strM6206);
                if (map6 == null) {
                    C1159 c1159M851115 = c5034.m8517();
                    c5372 = (C5371) c1159M851115.f18660;
                    str9 = this.f4884;
                    c1159M851115.m4637();
                    c1159M851115.mo6517();
                    AbstractC0487.m1090(str9);
                    AbstractC0487.m1090(strM6206);
                    c4465 = new C4461();
                    cursorQuery2 = c1159M851115.m2463().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM6206}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        it5 = it4;
                        while (true) {
                            C4630 c4636 = (C4630) ((C1209) C3117.m5718(C4630.m8013(), cursorQuery2.getBlob(1))).m1977();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) c4465.get(numValueOf5);
                            if (list5 == null) {
                                c5373 = c5372;
                                arrayList3 = new ArrayList();
                                c4465.put(numValueOf5, arrayList3);
                            } else {
                                c5373 = c5372;
                                arrayList3 = list5;
                            }
                            arrayList3.add(c4636);
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            c5372 = c5373;
                            str7 = str7;
                        }
                        cursorQuery2.close();
                        map6 = c4465;
                    } else {
                        it5 = it4;
                        str7 = str7;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    c0796.put(strM6206, map6);
                } else {
                    it5 = it4;
                    str7 = str7;
                }
                c0797 = c0796;
                while (r3.hasNext()) {
                    iIntValue = num6.intValue();
                    if (this.f4883.contains(num6)) {
                        c5374.mo2404().f12023.m9430(num6, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it6 = ((List) map6.get(num6)).iterator();
                    zM7679 = true;
                    c0798 = c0797;
                    while (true) {
                        if (it6.hasNext()) {
                            c4630 = (C4630) it6.next();
                            if (Log.isLoggable(c5374.mo2404().m6441(), 2)) {
                                C5590 c55915 = c5374.mo2404().f12023;
                                if (c4630.m8016()) {
                                    numValueOf4 = Integer.valueOf(c4630.m8015());
                                } else {
                                    numValueOf4 = null;
                                }
                                c55915.m9431("Evaluating filter. audience, filter, property", num6, numValueOf4, c5374.f17731.m7142(c4630.m8017()));
                                c5374.mo2404().f12023.m9430(c5034.m8505().m5728(c4630), "Filter definition");
                            }
                            if (c4630.m8016()) {
                            }
                            C5590 c55916 = c5374.mo2404().f12022;
                            C1005 c1005M6447 = C3610.m6440(this.f4884);
                            if (c4630.m8016()) {
                                numValueOf3 = Integer.valueOf(c4630.m8015());
                            } else {
                                numValueOf3 = null;
                            }
                            c55916.m9434(c1005M6447, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                            this.f4883.add(num6);
                            map6 = map6;
                            c0797 = c0798;
                        } else {
                            map6 = map6;
                            c0798 = c0798;
                        }
                        if (!zM7679) {
                            this.f4883.add(num6);
                        }
                        map6 = map6;
                        c0797 = c0798;
                        m3021(num6).m2812(c4379);
                        iIntValue = i2;
                        map6 = map6;
                        c0798 = c0798;
                    }
                }
                str7 = str7;
                it4 = it5;
                c0796 = c0797;
            }
        }
        arrayList2 = new ArrayList();
        C2163<Integer> c2168 = (C2163) this.f4885.keySet();
        c2168.removeAll(this.f4883);
        while (r3.hasNext()) {
            int iIntValue8 = num7.intValue();
            C1323 c13210 = (C1323) this.f4885.get(num7);
            AbstractC0487.m1047(c13210);
            C1971 c1971M2816 = c13210.m2811(iIntValue8);
            arrayList2.add(c1971M2816);
            c1159M8518 = c5034.m8517();
            c5371 = (C5371) c1159M8518.f18660;
            str8 = this.f4884;
            C3906 c3906M3869 = c1971M2816.m3864();
            c1159M8518.m4637();
            c1159M8518.mo6517();
            AbstractC0487.m1090(str8);
            AbstractC0487.m1047(c3906M3869);
            byte[] bArrM5759 = c3906M3869.m5754();
            contentValues = new ContentValues();
            contentValues.put("app_id", str8);
            contentValues.put(str5, num7);
            contentValues.put("current_results", bArrM5759);
            if (c1159M8518.m2463().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                c5371.mo2404().f12020.m9430(C3610.m6440(str8), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final C1323 m3021(Integer num) {
        if (this.f4885.containsKey(num)) {
            return (C1323) this.f4885.get(num);
        }
        C1323 c1323 = new C1323(this, this.f4884);
        this.f4885.put(num, c1323);
        return c1323;
    }

    @Override // p000.AbstractC2474
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo2428() {
    }
}
