package Coding_Ninjas.DP_Assignment2;
/*
Roy and Coin Boxes
Send Feedback
Roy has N coin boxes numbered from 1 to N.
Every day he selects two indices [L,R] and adds 1 coin to each coin box starting from L to R (both inclusive).
He does this for M number of days.

After M days, Roy has a query: How many coin boxes have atleast X coins.
He has Q such queries.
Input
First line contains N - number of coin boxes.
Second line contains M - number of days. Each of the next M lines consists of two space separated integers L and R. Followed by integer Q - number of queries.
Each of next Q lines contain a single integer X.a
Output
For each query output the result in a new line.
Constraints
1 ≤ N ≤ 1000000

1 ≤ M ≤ 1000000

1 ≤ L ≤ R ≤ N

1 ≤ Q ≤ 1000000

1 ≤ X ≤ N
Sample Input
7
4
1 3
2 5
1 2
5 6
4
1
7
4
2
Sample Output
6
0
0
4

testcases
Input:
7
4
1 3
2 5
1 2
5 6
4
1
7
4
2
output
6
0
0
4
input
1000
1000
282 706
388 521
574 934
410 922
396 525
4 550
48 698
595 953
852 861
3 677
534 674
408 417
615 899
830 873
362 393
989 991
318 820
316 708
712 919
181 745
197 728
765 782
735 999
444 697
452 712
623 838
538 849
480 604
724 974
603 650
487 864
656 785
607 870
249 831
906 955
832 982
515 603
597 868
1000 1000
191 669
218 524
970 980
659 897
268 837
996 997
157 483
673 731
195 475
343 707
333 750
876 920
461 780
868 969
116 408
62 823
691 721
395 641
240 602
784 935
202 849
299 632
363 465
964 990
698 852
369 902
820 821
377 557
323 529
598 622
575 676
841 943
218 643
733 886
68 268
905 925
71 463
285 820
235 306
412 566
850 861
469 712
658 748
249 943
909 985
14 575
34 405
597 622
260 521
102 554
76 453
296 535
580 619
281 463
858 861
523 748
999 999
757 884
995 998
834 989
5 787
679 717
384 495
178 310
450 497
55 306
128 270
930 994
109 436
158 542
498 800
233 791
837 973
616 980
752 787
235 297
622 653
788 925
888 995
586 782
118 645
567 629
925 962
899 951
402 848
300 478
196 686
827 828
508 804
729 876
54 663
37 424
245 904
462 491
951 964
888 907
627 791
529 800
620 983
356 940
361 673
971 996
589 769
74 93
404 820
712 859
485 931
114 705
865 884
779 795
565 926
678 946
989 995
257 735
101 425
885 979
367 701
43 197
577 710
976 997
150 462
152 466
500 507
715 945
496 850
386 819
585 925
752 848
485 540
775 859
263 285
922 988
447 494
176 505
522 644
809 994
35 373
935 943
52 580
712 791
571 858
636 751
324 884
500 622
825 829
967 993
444 922
402 938
750 767
792 916
290 649
272 272
640 854
699 774
939 958
216 523
77 681
458 793
756 756
815 862
661 861
742 899
34 217
738 925
475 752
761 938
531 908
159 739
199 559
38 919
789 961
512 849
123 329
496 930
408 413
39 806
296 840
201 711
630 651
261 344
230 367
478 706
430 885
202 516
703 818
188 442
80 167
965 992
518 700
493 499
376 927
18 85
640 959
758 996
37 452
912 918
317 599
966 987
746 807
599 865
132 139
179 372
190 372
321 343
238 970
839 850
772 898
359 494
130 697
350 638
942 961
953 993
814 866
833 996
411 833
225 770
926 972
650 847
565 659
339 586
481 771
238 787
345 831
916 928
559 862
809 944
492 978
653 886
493 653
287 896
393 664
27 819
475 722
317 990
521 898
628 647
52 623
195 221
881 962
851 977
483 703
962 968
767 826
523 667
661 832
799 873
642 939
600 717
559 843
216 500
462 898
832 894
77 404
988 993
302 993
952 952
337 732
620 988
933 989
305 764
971 974
216 604
465 775
830 968
191 626
170 282
62 324
511 792
726 792
447 855
534 570
146 461
999 1000
880 954
648 848
427 530
369 948
310 950
629 663
852 996
958 972
552 651
76 477
597 681
709 757
262 294
972 972
835 922
310 749
200 225
977 980
369 993
295 678
955 980
461 882
218 901
498 818
10 436
90 402
886 973
406 412
869 910
231 621
306 925
552 782
411 745
227 432
878 980
116 725
71 320
934 954
695 745
400 566
191 865
488 992
649 810
994 997
772 820
905 929
680 903
750 825
39 711
321 936
913 933
786 851
525 911
312 640
382 572
366 821
837 924
274 849
661 866
589 981
118 330
259 826
249 385
807 994
961 977
425 655
423 493
291 780
8 667
277 769
953 1000
544 764
994 996
196 588
803 934
869 961
438 689
75 981
19 473
222 509
374 697
549 773
593 851
101 704
512 927
230 292
668 672
665 979
435 639
302 372
738 973
990 1000
106 617
998 999
913 955
202 633
353 840
323 438
663 828
1 938
319 684
550 647
500 900
938 943
660 784
952 953
158 850
998 1000
670 925
259 317
674 709
502 897
364 746
241 544
567 572
252 342
796 856
94 160
548 959
464 725
313 471
549 741
638 784
473 583
876 964
638 938
20 835
322 945
986 988
451 958
789 873
29 639
405 961
769 857
70 984
416 562
248 967
252 725
499 750
85 116
385 982
396 676
602 985
429 588
395 513
828 983
678 682
636 795
756 955
551 651
331 891
501 636
646 683
721 994
418 441
703 822
326 468
970 989
673 977
410 532
711 897
368 940
359 847
466 931
916 972
656 776
5 156
728 977
767 812
544 896
551 715
74 664
405 507
7 812
378 608
682 820
629 705
875 989
257 619
713 836
39 170
786 822
765 876
379 802
640 988
559 987
428 727
935 986
378 849
295 703
595 881
742 780
745 874
466 915
729 879
828 930
597 894
599 756
99 151
25 145
577 665
421 421
457 820
482 727
793 929
37 815
852 859
962 976
535 751
405 782
155 820
95 233
265 480
626 981
152 813
971 979
219 741
782 963
680 851
868 924
336 470
436 450
415 559
731 894
203 837
997 1000
898 898
381 760
199 652
850 935
911 942
484 711
212 251
489 690
696 835
266 782
701 790
955 976
826 982
649 868
40 840
940 982
330 475
307 925
744 823
706 919
139 285
652 653
332 508
770 940
413 548
203 801
975 980
888 942
129 419
230 655
42 275
609 957
329 837
844 981
979 980
648 949
44 552
539 560
863 875
605 896
476 545
59 591
341 605
724 927
775 929
140 519
412 989
75 277
211 356
15 208
591 737
49 882
491 492
82 811
22 111
582 633
475 511
315 356
405 985
462 507
362 554
581 776
509 966
650 994
694 820
316 414
328 516
535 576
81 867
273 734
535 717
534 795
581 682
337 692
181 751
702 889
90 747
688 875
713 999
832 930
438 615
470 741
725 734
762 781
10 419
930 970
504 982
488 885
791 820
238 645
552 773
98 241
642 867
402 835
810 989
52 561
417 926
529 790
11 721
995 998
733 944
998 999
718 741
749 812
32 585
881 959
8 250
84 274
930 939
573 952
971 982
935 938
203 901
996 999
183 306
439 441
854 950
539 801
748 955
270 701
276 676
476 522
270 547
335 669
858 929
927 960
322 757
668 751
422 540
816 863
345 683
870 924
189 419
458 743
166 333
347 357
355 669
749 892
123 638
638 651
741 941
345 994
788 939
111 248
789 813
167 202
561 858
36 615
466 496
773 950
110 279
942 971
741 903
436 833
587 711
267 382
217 232
442 619
143 336
926 981
567 706
83 100
403 407
282 556
146 350
494 543
576 599
987 999
666 680
30 432
613 825
743 889
190 341
134 981
509 626
246 258
66 565
877 898
86 132
599 773
850 851
534 886
992 992
127 238
345 788
460 592
154 710
776 845
863 937
695 741
135 176
311 642
927 966
205 987
175 250
286 287
19 585
581 619
542 601
166 769
717 758
860 928
227 642
92 260
670 865
835 996
182 763
840 978
380 731
483 696
468 716
592 759
187 319
406 937
811 841
979 990
134 391
442 465
261 287
96 892
75 139
596 720
481 816
850 912
431 970
364 803
713 801
607 679
417 820
927 938
835 916
24 920
809 846
185 730
73 372
371 953
246 614
190 936
910 977
935 951
290 515
902 921
405 645
910 981
396 797
174 316
103 207
173 348
864 873
725 776
247 337
998 998
457 849
748 964
125 317
498 662
636 935
807 902
194 422
250 668
812 817
453 528
407 958
857 900
489 662
994 995
602 725
628 662
835 988
439 906
475 568
554 685
619 964
475 1000
427 697
144 433
714 825
521 884
341 729
173 620
196 407
653 934
568 903
519 672
761 960
801 871
393 447
405 719
640 712
661 682
211 296
992 995
291 914
480 761
198 958
779 965
850 914
952 972
611 981
290 347
944 978
15 125
868 975
53 583
483 888
28 591
771 818
357 947
574 980
359 917
533 750
429 789
822 901
532 703
179 727
886 982
80 129
129 197
1000 1000
102 811
14 294
131 547
147 498
238 387
84 501
282 931
854 911
789 995
586 683
702 743
886 984
281 615
687 707
268 892
248 545
838 884
716 834
755 827
552 649
481 698
582 798
799 859
815 888
861 892
623 814
315 704
543 966
396 901
489 632
376 725
746 930
63 678
93 97
488 603
940 972
810 979
821 960
917 917
799 915
591 978
710 877
487 794
956 987
458 708
929 936
845 849
260 534
264 661
216 903
108 140
417 579
817 976
161 954
94 227
658 808
66 879
10 498
429 785
551 991
334 568
800 843
699 838
237 467
750 816
658 707
897 924
326 518
406 457
99 832
400 753
711 965
633 827
941 955
232 361
880 978
221 775
188 435
787 882
373 524
242 596
254 798
49 967
817 871
831 839
796 945
431 984
29 331
477 993
694 755
510 969
885 952
129 849
945 984
510 710
713 731
654 724
86 668
256 511
319 629
311 919
296 437
929 950
148 446
360 833
103 601
776 851
179 682
350 563
575 847
987 997
652 793
46 492
133 560
971 975
540 839
977 987
420 856
470 623
131 940
779 976
391 461
612 758
866 946
999 1000
70 461
240 619
239 745
231 935
23 885
630 680
605 708
968 972
268 859
164 366
380 894
262 775
986 986
798 864
290 290
360 955
487 812
291 884
1000
516
706
453
83
926
855
362
480
283
727
196
482
44
664
44
885
714
524
124
108
620
257
854
532
496
523
455
457
806
308
710
267
230
314
748
58
487
450
108
315
11
696
887
72
91
847
950
670
929
346
932
410
918
787
405
332
905
695
17
330
794
860
746
816
765
267
991
504
932
714
416
158
483
400
119
713
342
618
621
460
472
381
166
869
529
190
621
482
467
94
324
757
1000
737
480
499
284
201
68
610
255
932
489
823
727
14
819
364
339
767
503
241
739
642
680
196
259
766
833
748
790
173
235
797
701
415
230
134
510
927
484
947
105
339
656
264
28
61
880
438
612
261
947
442
258
909
948
676
491
17
987
262
825
706
15
732
842
973
117
889
444
964
672
27
182
221
178
272
287
505
928
40
898
531
365
333
64
415
635
135
251
506
523
582
786
842
883
1000
446
997
303
688
549
452
429
14
287
554
293
436
70
469
645
745
621
985
440
351
953
573
346
947
160
502
579
177
197
868
758
632
974
206
712
214
913
434
371
660
956
825
192
93
484
146
594
81
32
128
949
218
827
735
774
232
373
651
364
238
216
681
345
707
848
239
11
39
820
330
377
973
992
214
242
292
540
578
223
487
278
437
303
564
609
13
545
645
146
575
979
594
107
132
632
629
268
140
700
723
557
532
486
624
259
288
284
929
471
921
184
290
695
326
659
518
698
351
562
37
860
300
928
959
440
863
939
516
435
950
794
532
424
911
489
128
750
773
830
820
558
481
748
73
807
370
951
646
480
628
430
714
6
435
436
298
274
802
589
618
345
581
664
930
136
961
633
957
272
754
839
82
914
266
65
19
489
418
737
117
252
205
490
88
483
568
843
644
769
524
452
155
339
47
633
417
892
469
153
767
745
924
688
525
401
746
390
300
659
250
204
208
69
82
105
984
688
269
732
99
871
484
444
902
725
816
16
835
328
804
548
727
630
761
653
679
900
510
770
91
479
13
24
10
395
28
967
384
576
713
196
874
965
657
526
158
675
981
410
971
424
158
87
884
760
231
198
375
130
807
121
529
14
571
519
51
116
264
214
402
564
996
768
180
243
842
265
22
410
717
823
456
196
332
153
955
281
187
769
968
688
269
894
355
113
131
554
721
17
106
892
654
921
693
315
10
308
447
913
514
611
153
409
149
423
390
950
164
961
307
255
94
722
415
637
408
230
378
847
131
859
522
736
778
550
377
734
352
626
220
813
446
76
519
991
583
829
384
963
878
623
686
955
999
251
374
247
314
971
52
336
570
408
521
669
301
699
449
102
367
421
969
686
647
480
324
280
474
39
921
345
140
260
909
574
972
143
928
591
818
686
722
443
824
336
142
945
333
282
787
603
480
792
326
724
526
387
513
657
258
133
44
908
31
992
397
363
185
870
81
870
985
604
417
773
54
296
910
883
651
852
559
145
163
105
567
147
321
690
489
909
57
643
962
692
994
954
869
89
862
595
90
960
626
881
622
237
95
91
292
577
226
426
583
803
158
596
322
973
673
534
659
841
554
654
95
566
723
598
582
286
80
441
416
455
221
558
597
412
970
321
602
249
277
821
85
257
356
711
292
400
839
754
918
249
904
124
466
731
158
398
531
821
886
772
49
144
656
477
199
626
201
602
244
909
71
269
379
259
816
387
160
553
263
656
745
41
965
594
21
255
432
64
173
338
362
378
115
780
490
691
559
639
799
981
957
83
10
825
412
157
834
210
984
806
319
499
288
10
425
568
173
497
613
922
388
407
179
291
569
325
312
556
433
59
920
338
910
86
283
366
348
706
500
531
634
515
698
902
297
463
988
289
649
199
31
997
354
675
756
431
344
249
720
680
99
333
751
72
597
147
109
867
728
973
592
715
769
345
655
869
342
273
170
349
53
790
712
284
436
801
121
476
413
822
455
314
407
762
928
670
201
44
351
466
586
16
538
978
788
699
865
374
128
552
791
161
555
74
868
315
442
915
930
891
663
657
111
224
730
337
554
832
730
194
151
158
654
851
381
131
608
583
175
126
165
695
675
783
885
590
920
792
883
265
865
176
976
520
76
164
107
586
898
373
941
746
490
328
269
617
968
536
983
886
134
228
558
799
650
17
209
18
972
488
526
75
163
376
283
355
587
146
572
322
347
793
769
597
493
545
165
188
554
89
534
711
971
483
498
127
355
906
442
315
815
139
71
298
806
257
255
729
940
735
127
897
454
43
917
493
914
702
421
622
795
321
423
136
101
954
121
13
488
145
944
24
565
497
292
179
323
output:
0
0
0
895
0
0
138
0
444
0
671
0
945
0
945
0
0
0
808
842
0
523
0
0
0
0
0
0
0
388
0
490
598
369
0
921
0
0
842
366
990
0
0
906
882
0
0
0
0
223
0
0
0
0
0
266
0
0
979
285
0
0
0
0
0
490
0
0
0
0
0
744
0
0
826
0
232
0
0
0
0
3
732
0
0
687
0
0
0
875
315
0
0
0
0
0
443
656
908
0
529
0
0
0
0
986
0
121
243
0
0
560
0
0
0
671
516
0
0
0
0
720
582
0
0
0
598
785
0
0
0
0
851
243
0
503
965
917
0
0
0
512
0
0
518
0
0
0
0
979
0
508
0
0
982
0
0
0
828
0
0
0
0
965
704
627
710
479
438
0
0
951
0
0
114
258
912
0
0
780
538
0
0
0
0
0
0
0
0
0
400
0
0
0
0
986
438
0
425
0
906
0
0
0
0
0
0
218
0
0
223
0
742
0
0
710
664
0
0
0
0
651
0
637
0
0
71
0
0
0
681
876
0
761
0
897
959
801
0
632
0
0
0
595
57
0
121
572
633
0
223
0
0
566
990
951
0
285
27
0
0
637
556
425
0
0
625
0
461
0
400
0
0
986
0
0
761
0
0
0
848
790
0
0
489
768
0
0
0
0
0
0
516
436
443
0
0
0
697
427
0
297
0
0
0
218
0
953
0
411
0
0
0
0
0
0
0
0
0
0
0
0
0
801
0
0
0
0
0
0
0
905
0
81
0
0
0
0
0
0
994
0
0
417
476
0
0
0
223
0
0
0
777
0
0
0
479
0
0
895
0
492
911
978
0
0
0
828
537
653
0
886
0
0
0
0
0
0
0
748
243
940
0
0
0
0
749
0
0
0
0
0
0
0
0
411
0
538
653
646
908
895
851
0
0
487
0
870
0
0
0
0
0
0
982
0
292
0
0
0
0
0
0
0
0
0
0
882
0
986
970
990
0
965
0
0
0
0
671
0
0
0
0
744
0
0
0
0
0
744
888
0
0
595
664
43
796
0
816
0
986
0
0
933
830
503
637
0
0
0
0
707
553
0
498
973
0
0
0
0
671
266
749
0
447
690
0
0
0
487
0
197
833
795
0
0
979
850
0
0
0
0
366
990
388
0
0
0
0
749
0
754
0
0
0
737
0
388
529
875
0
0
0
0
598
22
0
795
0
0
0
0
0
27
0
217
0
628
0
0
904
0
0
0
0
0
0
0
0
0
0
0
538
50
546
369
0
933
253
0
0
0
0
406
0
0
862
100
0
0
0
0
0
315
451
0
951
0
223
768
514
0
0
0
765
0
0
0
0
0
0
0
253
767
0
258
446
0
0
0
0
297
0
0
0
0
0
518
786
945
0
959
0
0
130
692
0
897
0
0
0
0
0
930
419
0
0
0
0
0
762
740
851
0
759
339
0
0
0
921
0
0
0
0
0
0
885
0
0
883
0
0
0
0
572
873
882
425
0
617
0
0
0
744
0
330
0
0
0
0
0
0
0
873
0
0
0
0
440
898
0
0
0
627
0
0
0
0
339
0
541
466
0
892
523
182
0
425
0
0
0
0
541
0
808
0
0
744
0
0
0
0
0
936
764
0
0
662
0
656
0
551
0
906
487
13
516
0
0
742
0
505
0
0
950
0
0
974
529
0
912
720
245
138
22
830
0
0
0
0
0
0
0
0
895
990
0
0
748
0
642
0
0
350
0
436
990
0
0
720
0
0
0
0
0
708
426
0
305
375
0
0
920
0
245
0
888
444
108
220
0
0
0
0
0
0
0
419
0
0
429
0
662
959
0
214
0
0
0
226
541
0
0
870
258
0
906
0
759
842
0
0
0
0
0
0
223
0
0
232
478
729
220
931
0
0
443
0
0
816
0
0
0
0
369
0
0
0
0
656
945
218
0
0
982
0
0
0
0
0
50
801
0
0
741
0
905
0
366
0
0
0
0
0
0
835
624
0
248
0
0
0
679
752
744
0
0
3
795
0
0
710
804
734
0
0
0
0
0
0
0
0
498
0
710
0
0
904
737
848
0
0
57
0
0
0
292
487
0
0
0
0
0
785
606
0
0
0
979
643
978
0
0
0
904
740
37
444
197
0
761
0
330
221
0
0
0
0
0
734
689
0
885
0
0
0
0
0
802
197
0
0
366
0
770
906
417
0
523
529
0
0
0
802
0
0
947
0
0
0
0
0
0
0
339
0
777
865
0
816
986
0
762
0
970
0
0
425
708
322

 */
public class Roy_and_Coin_Boxes {
}
